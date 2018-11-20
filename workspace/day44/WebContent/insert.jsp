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
	request.setCharacterEncoding("EUC-KR");
	String sql="INSERT INTO EX44 (NUM,SUB,CONTENT,NALJA,REF) " 
					+" VALUES (EX44_SEQ.NEXTVAL,?,?,SYSDATE,EX44_SEQ.CURRVAL)";
	
	try{
		Class.forName(driver);
		conn=DriverManager.getConnection(url, user, password);
		pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, request.getParameter("sub"));
		pstmt.setString(2, request.getParameter("content"));
		pstmt.executeUpdate();
	}finally{
		if(pstmt!=null)pstmt.close();
		if(conn!=null)conn.close();
	}
	response.sendRedirect("list.jsp");
	%>
	
</body>
</html>


















