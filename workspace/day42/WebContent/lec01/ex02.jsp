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
	<h1>ex02 page<br><%=su2 %></h1>
	<p>������ ��Ƽ�긦 ����Ͽ�</p>
	<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	su1=4321;
	int su2=9876;
%>
	<h2>�ҷ��ó���</h2>
	<p>�̳����� �ҷ����� ����</p>
	<p>���ó�� �ҷ������� �մϴ�<br><%=su1 %><br><%=su2 %></p>
</body>
</html>