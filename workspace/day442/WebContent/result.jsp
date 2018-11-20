<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="connection.jspf" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
	String id=request.getParameter("id");
	String pw=request.getParameter("pw");
	String sql="select count(*) from user04 where id=? and pw=?";
	int su=0;
	try{
		newConnection();
		pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, id);
		pstmt.setString(2, pw);
		rs=pstmt.executeQuery();
		if(rs.next())su=rs.getInt(1);
	}finally{
		
	}
	if(su>0)response.sendRedirect("index.jsp?id="+id);
	else response.sendRedirect("index.jsp");
	%>
</body>
</html>













