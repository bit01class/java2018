<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body background="./imgs/bg.jpg">
	<table border="1" cellspacing="0" width="800" align="center" bgcolor="#ffffff">
		<tr>
			<td colspan="2">
			<img src="./imgs/logo.jpg" alt="logo">
			</td>
		</tr>
		<tr>
			<td width="150">
			<p><a href="menu1.jsp">회사소개</a></p>
			<p><a href="menu2.jsp">오시는길</a></p>
			<p><a href="list.jsp">게시판</a></p>
			<p><a href="#">방명록</a></p>
			</td>
			<td>
				<h1 align="center">입력페이지</h1>
				<form action="insert.jsp">
					<table align="center">
						<tr>					
							<td>제목</td>
							<td>
								<input type="text" name="sub" size="30">
							</td>
						</tr>
						<tr>					
							<td>글쓴이</td>
							<td>
								<input type="text" name="name" size="12" value="guest" readonly="readonly">
							</td>
						</tr>
						<tr>					
							<td colspan="2">
							<textarea rows="10" cols="40" name="content"></textarea>
							</td>
						</tr>
						<tr>					
							<td colspan="2">
								<input type="submit" value="입 력">
								<input type="reset" value="취 소">
							</td>
						</tr>
					</table>
				</form>
			
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
			비트캠프 서울시 서초구 서초동 1327-15 비트아카데미빌딩<br>
			(주)비트컴퓨터 서초지점 대표이사 : 조현정<br> 
			Copyright &copy; 비트캠프 All rights reserved.<br>
			</td>
		</tr>
	</table>
</body>
</html>











