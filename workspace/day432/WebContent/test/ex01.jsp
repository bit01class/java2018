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
	int su1=1234;
%>
	<h1>원래 내용</h1>
	
	<p>다음은 불러온 내용입니다</p>
	<%@ include file="ex11.jspf" %>
	<p>상단은 불러온 내용입니다</p>
</body>
</html>