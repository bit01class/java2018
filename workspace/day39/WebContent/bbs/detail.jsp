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
<%!
	final String driver="oracle.jdbc.driver.OracleDriver";
	final String url="jdbc:oracle:thin:@localhost:1521:xe";
	final String user="scott";
	final String password="tiger";

	Connection conn;
	Statement stmt;
	ResultSet rs;
%>
<%
	String sql2="update ex39 set cnt=cnt+1 where num="+request.getParameter("num");
	try{
		Class.forName(driver);
		conn=DriverManager.getConnection(url, user, password);
		conn.setAutoCommit(false);
		stmt=conn.createStatement();
		stmt.executeUpdate(sql2);
	}catch(Exception e){
		conn.rollback();
	}finally{
		if(stmt!=null)stmt.close();
	}


	String sql="select * from ex39 where num="+request.getParameter("num");
	int num=-1,cnt=0;
	String sub="-",name="-",content="-";
	Date nalja=null;
	try{
		//Class.forName(driver);
		//conn=DriverManager.getConnection(url, user, password);		
		stmt=conn.createStatement();
		rs=stmt.executeQuery(sql);
		if(rs.next()){
			num=rs.getInt("num");
			cnt=rs.getInt("cnt");
			sub=rs.getString("sub");
			name=rs.getString("name");
			content=rs.getString("content");
			nalja=rs.getDate("nalja");
		}
		conn.commit();
	}catch(Exception e){
		conn.rollback();
	}finally{
		conn.setAutoCommit(true);
		if(rs!=null)rs.close();
		if(stmt!=null)stmt.close();
		if(conn!=null)conn.close();
	}
	if(num!=-1){
%>
	<h1>상세 페이지(<%=num %>번)</h1>
	<table width="80%">
		<tr>
			<td width="50" bgcolor="gray">제목</td>
			<td colspan="5"><%=sub %></td>
		</tr>
		<tr>
			<td width="50" bgcolor="gray">글쓴이</td>
			<td><%=name %></td>
			<td width="50" bgcolor="gray">날짜</td>
			<td><%=nalja %></td>
			<td width="50" bgcolor="gray">조회수</td>
			<td><%=cnt %></td>
		</tr>
		<tr>
			<td colspan="6"><%=content %></td>
		</tr>
	</table>
<%
	}else{
%>	
	<h1>해당 페이지는 존재하지 않습니다</h1>
<%
	}
%>	
	
	
	
</body>
</html>