<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" errorPage="../err.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="../template/header.jspf" %>
	<%
	if("POST".equals(request.getMethod())){
		String param1=request.getParameter("sub");
		String param2=request.getParameter("id");
		String param3=request.getParameter("content");
		/////////
		String sub=param1.trim();
		String id=param2.trim();
		String content=param3.trim();
		
		String sql="insert into ex43 values (ex43_seq.nextval, '"
							+id+"','"+sub+"','"+content+"',sysdate,0)";
		try{
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, password);
			stmt=conn.createStatement();
			stmt.executeUpdate(sql);
		}finally{
			if(stmt!=null)stmt.close();
			if(conn!=null)conn.close();
		}
		response.sendRedirect("list.jsp");
		return;
	}
	%>
	<%@ include file="../template/menu.jspf" %>
	<h1>글쓰기</h1>
	<form action="add.jsp" method="post">
		<table>
			<tr>
				<td>제목</td>
				<td><input type="text" name="sub"></td>
			</tr>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td></td>
				<td><textarea rows="5" cols="60" name="content"></textarea></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="입 력">
					<input type="reset" value="취 소">
					<input type="button" value="뒤 로" onclick="history.back();">
				</td>
			</tr>
		</table>
	</form>
	<%@ include file="../template/footer.jspf" %>
</body>
</html>











