<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../template/header.jsp"></jsp:include>
	<jsp:include page="../template/menu.jsp">
		<jsp:param value=".." name="path"/>
	</jsp:include>
	<h1>입력 페이지</h1>
	<form action="insert.jsp" method="post">
		<table>
			<tr>
				<td>제목</td>
				<td><input type="text" name="sub"> </td>
			</tr>
			<tr>
				<td>글쓴이</td>
				<td><input type="text" name="id"> </td>
			</tr>
			<tr>
				<td></td>
				<td><textarea rows="5" cols="60" name="content"></textarea> </td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="입력">
					<input type="reset" value="취소">
					<input type="button" value="뒤로" onclick="history.back();">
				</td>
			</tr>
		</table>
	</form>
	
	<jsp:include page="../template/footer.jsp"></jsp:include>
</body>
</html>











