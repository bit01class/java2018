<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>application scope의 정보습득</h1>
	<h2>msg:<%=application.getInitParameter("msg") %></h2>
	<%
	Enumeration vac=application.getInitParameterNames();
	while(vac.hasMoreElements()){
		System.out.println(vac.nextElement());
	}
	%>
</body>
</html>