<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" isErrorPage="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="template/header.jspf" %>
	<%@ include file="template/menu.jspf" %>
	
	<h1>문제가 발생했습니다</h1>
	<p>
	재시도 후에도 동일한 문제가 발생시 관리자에게 연락바랍니다<br>
	빠른 조치를 취하겠습니다	
	</p>
	<input type="button" value="뒤로가기" onclick="history.back();">
	
	
	<%@ include file="template/footer.jspf" %>
</body>
</html>