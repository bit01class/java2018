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
	String addr=request.getRemoteAddr();
	int port=request.getRemotePort();
	
	String serv_addr=request.getServerName();//request.getLocalAddr();
	int serv_port=request.getServerPort();//request.getLocalPort();
	String uri=request.getRequestURI();
	String path=request.getContextPath();
	%>
	<h1><%=addr %></h1>
	<h1><%=port %></h1>
	<hr>
	<h1><%=serv_addr %></h1>
	<h1><%=serv_port %></h1>
	<h1><%=uri %></h1>
	<h1><%=path %></h1>
</body>
</html>











