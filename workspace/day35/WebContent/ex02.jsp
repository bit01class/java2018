<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>동적 페이지</h1>
	<%
	java.util.Date date=new java.util.Date();
	out.println(date);
	
	for(int i=0; i<4; i++){
	
		out.println("<img src=\"icon"+(i+1)+".png\">");
		
	}
	%>
	
</body>
</html>