package com.bit.day33;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class OracleConnectionTest {

	public static void main(String[] args) {
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
//		String url="jdbc:oracle:thin:scott/tiger@127.0.0.1:1521:xe";
		String id="scott";
		String pw="tiger";
		
//		new oracle.jdbc.driver.OracleDriver();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
//		Properties info = new Properties();
//		info.setProperty("user", id);
//		info.setProperty("password", pw);
		
		java.sql.Connection conn=null;
		try {
			conn=DriverManager.getConnection(url,id,pw);
			if(conn==null){
				System.out.println("立加 角菩");
			}else{
				System.out.println("立加 己傍");
			}
			conn.close();
		} catch (SQLException e) {
			System.out.println("立加 角菩");
		}
		
	}

}

















