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
	String su2=request.getParameter("su");
System.out.println("ex12:"+su2);
%>
	<h2>불러올 내용</h2>
	<p>불러들인 내용은 여기입니다</p>
</body>
</html>