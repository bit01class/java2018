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
	int su2=5677;
%>
	<h1>�׼� �±׸� ����� �ҷ�����</h1>
	
	<p>ex12�� �ҷ����ڽ��ϴ�</p>
	<jsp:include page="ex12.jsp">
		<jsp:param value="<%=su2 %>" name="su"/>
	</jsp:include>
	<p>�Ȱ��� �ҷ��� ����� ���� �� �ֽ��ϴ�</p>
	<%
	System.out.println("ex02:"+su2);
	%>
</body>
</html>