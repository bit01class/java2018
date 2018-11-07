<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- html의 주석 -->
	<h1>jsp 페이지 입니다</h1>
	<%
	// 한줄 주석
	/*
		다줄 주석
	*/
	System.out.println("jsp 페이지 호출...");
	out.println("<!-- jsp페이지 호출 -->");
	%>
</body>
</html>