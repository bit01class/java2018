<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%@ include file="ora.jspf" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
	
	String sql="SELECT * FROM EX44 WHERE NUM=?";
	String param=request.getParameter("idx");
	int num=Integer.parseInt(param);
	String sub=null;
	String content=null;
	java.sql.Date nalja=null;
	int ref=0, ord=0, lev=0;
	
	try{
		Class.forName(driver);
		
		conn=DriverManager.getConnection(url, user, password);
		pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1, num);
		rs=pstmt.executeQuery();
		if(rs.next()){
			sub=rs.getString("sub");
			content=rs.getString("content");
			nalja=rs.getDate("nalja");
			ref=rs.getInt("ref");
			ord=rs.getInt("ord");
			lev=rs.getInt("lev");
		}
	}finally{
		if(rs!=null)rs.close();
		if(pstmt!=null)pstmt.close();
		if(conn!=null)conn.close();
	}
	%>
	<h1>상세 페이지(<%=num %>)</h1>
	<table>
		<tr>
			<td>제목</td>
			<td><%=sub %></td>
		</tr>
		<tr>
			<td>날짜</td>
			<td><%=nalja.toString() %></td>
		</tr>
		<tr>
			<td>내용</td>
			<td><%=content %></td>
		</tr>
		<tr>
			<td colspan="2">
				<a href="#">[수 정]</a>
				<a href="#">[삭 제]</a>
				<a href="re.jsp?ref=<%=ref %>&ord=<%=ord %>&lev=<%=lev%>">[답 글]</a>
			</td>
		</tr>
	</table>
</body>
</html>












