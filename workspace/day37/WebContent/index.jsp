<%@page import="java.util.concurrent.ExecutionException"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>방명록</h1>
	<table border="1" width="500">
	<tr>
		<td>내용</td>
		<td>날짜</td>
	</tr>
	<%
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	String sql="select content,nalja from ex37";
	Connection conn=null;
	Statement stmt=null;
	ResultSet rs=null;
	try{
		Class.forName(driver);
		conn=DriverManager.getConnection(url, user, password);
		stmt=conn.createStatement();
		rs=stmt.executeQuery(sql);
		while(rs.next()){ 
	%>
	<tr>
		<td><pre><%=rs.getString(1) %></pre></td>
		<td width="100"><%=rs.getDate(2) %></td>
	</tr>
	<%
		}
	}catch(Exception e){
	}finally{
		if(rs!=null)rs.close();
		if(stmt!=null)stmt.close();
		if(conn!=null)conn.close();
	}
	%>
	
	</table>
	
	<form action="add.jsp">
		<textarea rows="3" cols="20" name="content"></textarea>
		<input type="submit" value="입력">
	</form>
</body>
</html>