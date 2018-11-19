<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.HashMap" errorPage="../err.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="../template/header.jspf" %>
	<%
		String param=request.getParameter("num");
		HashMap map=new HashMap();
		
		try{
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, password);
			stmt=conn.createStatement();
			rs=stmt.executeQuery("SELECT * FROM EX43 WHERE NUM="+param);
			if(rs.next()){
				map.put("num", rs.getInt("num"));
				map.put("id", rs.getString("id"));
				map.put("sub", rs.getString("sub"));
				map.put("content", rs.getString("content"));
				map.put("nalja", rs.getDate("nalja"));
				map.put("cnt",rs.getInt("cnt"));
			}
		}finally{
			if(rs!=null)rs.close();
			if(stmt!=null)stmt.close();
			if(conn!=null)conn.close();
		}
	%>
	<%@ include file="../template/menu.jspf" %>
	<h1>상세페이지</h1>
	<table>
		<tr>
			<td width="80" bgcolor="gray">글번호</td>
			<td><%=map.get("num") %> </td>
			<td width="80" bgcolor="gray">글쓴이</td>
			<td><%=map.get("id") %></td>
			<td width="80" bgcolor="gray">날짜</td>
			<td><%=map.get("nalja") %></td>
			<td width="80" bgcolor="gray">조회수</td>
			<td><%=map.get("cnt") %></td>
		</tr>
		<tr>
			<td bgcolor="gray">제목</td>
			<td colspan="7"><%=map.get("sub") %></td>
		</tr>
		<tr>
			<td bgcolor="gray" height="200"></td>
			<td colspan="7"><%=map.get("content") %></td>
		</tr>
		<tr>
			<td colspan="8">
				<form action="edit.jsp">
					<input type="hidden" name="num" value="<%=param%>">
					<input type="submit" value="수정">
				</form>
				<form action="del.jsp">
					<input type="hidden" name="num" value="<%=param%>">
					<input type="submit" value="삭제">
				</form>
				<input type="button" value="뒤로" onclick="history.back();">
			</td>
		</tr>	
	</table>
	
	<%@ include file="../template/footer.jspf" %>
</body>
</html>












