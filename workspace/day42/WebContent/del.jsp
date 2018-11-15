<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
	String param=request.getParameter("idx");
	String sql="delete from stu where idx="+param;
	String sql2="update stu set num=num-1 where idx>=1+"+param;
	
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	
	Connection conn=null;
	Statement stmt=null;
	
	try{
		Class.forName(driver);
		conn=DriverManager.getConnection(url,user,password);
		conn.setAutoCommit(false);
		stmt=conn.createStatement();
		stmt.executeUpdate(sql);
		stmt=conn.createStatement();
		stmt.executeUpdate(sql2);
		conn.commit();
	}catch(Exception e){
		conn.rollback();
		e.printStackTrace();
	}finally{
		if(stmt!=null)stmt.close();
		if(conn!=null)conn.close();
	}
	response.sendRedirect("/day42/");
	%>
</body>
</html>



















