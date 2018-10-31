package com.bit.day33;

import java.awt.Button;
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

public class Ex02 implements ActionListener{
	static TextField tf;
	static Label[] la;

	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println(tf.getText());
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String id="scott";
		String pw="tiger";
		
		String sql="select empno,ename, job, sal from emp where empno="+tf.getText();
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url, id, pw);
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			if(rs.next()){
				la[0].setText(rs.getString(1));
				la[1].setText(rs.getString(2));
				la[2].setText(rs.getString(3));
				la[3].setText(rs.getString(4));
			}
		} catch (ClassNotFoundException e1) {
			System.out.println("드라이버 확인");
		} catch (SQLException e1) {
			System.out.println("접속정보 확인");
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
	
	public static void main(String[] args) {

		Frame f=new Frame();
		
		Panel p=new Panel(new GridLayout(2,1));
		Panel top=new Panel();
		top.add(new Label("사번"));
		tf=new TextField(15);
		top.add(tf);
		Button btn=new Button("조회");
		btn.addActionListener(new Ex02());
		top.add(btn);
		Panel down=new Panel(new GridLayout(1,4));
		la=new Label[4];
		for(int i=0; i<la.length;i++){
			la[i]=new Label();
			down.add(la[i]);
		}
		
		p.add(top);
		p.add(down);
		
		f.add(p);
		f.setSize(400,300);
		f.setLocation(1920+100, 100);
		f.setVisible(true);
		
	}


}
