<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>답글 페이지</h1>
	<form action="reinsert.jsp" method="post">
		<input type="hidden" name="ref" value="<%=request.getParameter("ref")%>">
		<input type="hidden" name="ord" value="<%=request.getParameter("ord")%>">
		<input type="hidden" name="lev" value="<%=request.getParameter("lev")%>">
		<table>
			<tr>		
				<td>제목</td>
				<td> re:<input type="text" name="sub"> </td>
			</tr>
			<tr>		
				<td>내용</td>
				<td><textarea rows="5" cols="60" name="content"></textarea> </td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="작 성">
					<input type="reset" value="취 소">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>























