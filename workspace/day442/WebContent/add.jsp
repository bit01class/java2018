<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>입력 페이지</h1>
	<form action="insert.jsp" method="post">
	<input type="hidden" name="id" value="<%=request.getParameter("id") %>">
		<table>
			<tr>
				<td>제목</td>
				<td><input type="text" name="sub"> </td>
			</tr>
			<tr>
				<td>글쓴이</td>
				<td><input type="text" name="writer" value="<%=request.getParameter("id") %>"> </td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea rows="5" cols="60" name="content"></textarea> </td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="입 력">
					<input type="reset" value="취 소">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>