package com.bit.day33;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ex01 {

	public static void main(String[] args) {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String passwd="tiger";
		String sql="SELECT SYSDATE as \"now\" FROM DUAL";
		
		Connection conn=null;
		java.sql.Statement stmt=null;
		java.sql.ResultSet rs=null;
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,user,passwd);
			
			stmt=conn.createStatement();
			
			rs=stmt.executeQuery(sql);
			
			System.out.println(rs.next());
			System.out.println(rs.getObject("now"));
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 파일 및 주소 확인 요망");
		} catch (SQLException e) {
			System.out.println("url,id,pw확인요망");
		} finally{
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}













