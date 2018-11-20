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
	// String sql="select num from user04 where id=";
	String sub=request.getParameter("sub");
	String content=request.getParameter("content");
	int num=1;
	String sql="insert into bbs04 values (bbs04_seq.nextval,?,?,sysdate,?)";
	try{
		newConnection();
		pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, sub);
		pstmt.setString(2, content);
		pstmt.setInt(3, num);
		pstmt.executeUpdate();
	}finally{
		if(pstmt!=null)pstmt.close();
		if(conn!=null)conn.close();
	}
	
	response.sendRedirect("index.jsp?pname=list&id="+id);
%>


</body>
</html>















