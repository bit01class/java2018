package com.bit.day34;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex01 extends Frame implements ActionListener {
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
	String user="scott";
	String password="tiger";

	Choice cho;
	Label[] la;
	TextField[] tf;
	
	public Ex01() {
		Panel pmain =new Panel(new BorderLayout());
		Panel ptop=new Panel();
		Button btnAdd=new Button("입력");
		btnAdd.addActionListener(this);
		Button btnSch=new Button("검색");
		btnSch.addActionListener(this);
		cho=new Choice();
		itemSet();
		
		ptop.add(btnAdd);
		ptop.add(cho);
		ptop.add(btnSch);
		
		Panel pcenter=new Panel(new GridLayout(6,1));
		la=new Label[5];
		tf=new TextField[5];
		String[] mark={"사번","이름","직급","연봉","입사일"};
		for(int i=0; i<la.length; i++){
			Panel temp=new Panel();
			la[i]=new Label(mark[i]);
			tf[i]=new TextField(15);
			temp.add(la[i]);
			temp.add(tf[i]);
			pcenter.add(temp);
		}
		Panel pdown=new Panel();
		Button btnEdit=new Button("수정");
		btnEdit.addActionListener(this);
		Button btnDel=new Button("삭제");
		pdown.add(btnEdit);
		pdown.add(btnDel);
		pcenter.add(pdown);
		
		
		pmain.add(ptop, BorderLayout.NORTH);
		pmain.add(pcenter, BorderLayout.CENTER);
		add(pmain);
		setBounds(1920+100, 100, 300, 600);
		setVisible(true);
	}
	
	public void itemSet(){
		String sql="select empno from emp";
		
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,user,password);
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()){
				cho.addItem(rs.getString(1));
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버확인하세요(오타,jar)");
		} catch (SQLException e) {
			System.out.println("접속정보를 다시 확인하세요(오타)");
		} finally{
			try {
				if(rs!=null)rs.close();
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		new Ex01();
	}

	public void detail(){
		String sql="select empno,ename,job,sal,hiredate from emp where empno="+cho.getSelectedItem();
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, password);
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			if(rs.next()){
				tf[0].setText(rs.getInt(1)+"");
				tf[1].setText(rs.getString(2));
				tf[2].setText(rs.getString(3));
				tf[3].setText(rs.getInt(4)+"");
				tf[4].setText(rs.getDate(5).toString());
			}
		} catch (ClassNotFoundException e1) {
			System.out.println("드라이버 확인");
		} catch (SQLException e1) {
			e1.printStackTrace();
//			System.out.println("접속정보 확인");
		} finally{
			try {
				if(rs!=null)rs.close();
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}
	
	public void dbAdd(){
		String sql="insert into emp (empno,ename,job,sal,hiredate) values ("
					+tf[0].getText()+",'"+tf[1].getText()
					+"','"+tf[2].getText()+"',"+tf[3].getText()+",sysdate)";
		//insert into emp (empno,ename,job,sal) values (1111,'test1','test2',1000)
		Connection conn=null;
		Statement stmt=null;
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,user,password);
			stmt=conn.createStatement();
			int result=stmt.executeUpdate(sql);
			if(result>0)System.out.println("성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void dbUpdate(){
		// update emp set ename='?', job='?', sal=3 where empno=?
		String sql="update emp set ename='"+tf[1].getText()
				+"', job='"+tf[2].getText()+"', sal="+tf[3].getText()
				+" where empno="+tf[0].getText();

		Connection conn=null;
		Statement stmt=null;
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,user,password);
			stmt=conn.createStatement();
			int su=stmt.executeUpdate(sql);
			if(su>0){
				System.out.println("수정성공");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println(cho.getSelectedItem());
		Button btn=(Button) e.getSource();
		if(btn.getLabel().equals("입력")){
			dbAdd();
			cho.removeAll();
			itemSet();
			for(int i=0; i<tf.length; i++){
				tf[i].setText("");
			}
		}else if(btn.getLabel().equals("검색")){
			detail();
		}else if(btn.getLabel().equals("수정")){
			dbUpdate();
			for(int i=0; i<tf.length; i++){
				tf[i].setText("");
			}
		}
	}

}











