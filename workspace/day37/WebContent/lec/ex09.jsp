<%@page import="java.io.OutputStreamWriter"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>출력</h1>
	<%
	try{
		ServletOutputStream myOut=response.getOutputStream();
		new OutputStreamWriter(myOut);
	}catch(Exception e){
	}
	
	javax.servlet.jsp.JspWriter my=out;
	
	ServletRequest req=pageContext.getRequest();
	ServletRequest my2=request;
	%>
</body>
</html>



























