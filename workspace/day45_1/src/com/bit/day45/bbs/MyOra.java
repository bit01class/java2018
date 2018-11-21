package com.bit.day45.bbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyOra {
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";

	private Connection conn;
	
	public Connection getConnection(){
		
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
}












