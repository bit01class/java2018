<%@page import="java.sql.DriverManager, java.sql.Connection, java.sql.Statement"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
	String content=request.getParameter("content"); 
	String sql="insert into ex37 values ('"+content+"',sysdate)";
	System.out.println(sql);
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	Connection conn=null;
	Statement stmt=null;
	int result=0;
	try{
		Class.forName(driver);
		conn=DriverManager.getConnection(url,user,password);
		stmt=conn.createStatement();
		result=stmt.executeUpdate(sql);
	}catch(Exception e){
		
	}finally{
		if(conn!=null)conn.close();
	}
	if(result>0)out.println("<h1>입력 성공</h1>");
	else out.println("<h1>입력오류</h1>");
	%>
	<a href="index.jsp">처음으로</a>
</body>
</html>





















