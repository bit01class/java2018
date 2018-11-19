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
	<h1>액션 태그를 사용한 불러오기</h1>
	
	<p>ex12를 불러오겠습니다</p>
	<jsp:include page="ex12.jsp">
		<jsp:param value="<%=su2 %>" name="su"/>
	</jsp:include>
	<p>똑같이 불러온 모습을 보실 수 있습니다</p>
	<%
	System.out.println("ex02:"+su2);
	%>
</body>
</html>