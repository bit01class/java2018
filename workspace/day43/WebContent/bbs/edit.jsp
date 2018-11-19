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
	
	if("POST".equals(request.getMethod())){
		String path="edit";
		String param1=request.getParameter("num");
		String param2=request.getParameter("sub");
		String param3=request.getParameter("content");
		/////varidation/////
		int num=Integer.parseInt(param1);
		String sub=param2.trim();
		String content=param3.trim();
		
		String sql="update ex43 set sub='"+sub+"',content='"+content+"' where num="+num;
		try{
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, password);
			stmt=conn.createStatement();
			int result=stmt.executeUpdate(sql);
			if(result>0)path="detail";
		}finally{
			if(stmt!=null)stmt.close();
			if(conn!=null)conn.close();
		}
		response.sendRedirect(path+".jsp?num="+num);
		return;	
	}
	
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
	<h1>수정페이지</h1>
	<form method="post">
	<table>
		<tr>
			<td width="80" bgcolor="gray">글번호</td>
			<td><%=map.get("num") %><input type="hidden" name="num" value="<%=map.get("num") %>" readonly="readonly" size="5"></td>
			<td width="80" bgcolor="gray">글쓴이</td>
			<td><%=map.get("id") %></td>
			<td width="80" bgcolor="gray">날짜</td>
			<td><%=map.get("nalja") %></td>
			<td width="80" bgcolor="gray">조회수</td>
			<td><%=map.get("cnt") %></td>
		</tr>
		<tr>
			<td bgcolor="gray">제목</td>
			<td colspan="7"><input type="text" name="sub" value="<%=map.get("sub") %>"></td>
		</tr>
		<tr>
			<td bgcolor="gray" height="200"></td>
			<td colspan="7"><textarea rows="5" cols="60" name="content"><%=map.get("content") %></textarea></td>
		</tr>
		<tr>
			<td colspan="8">
				<input type="submit" value="수정">
				<input type="reset" value="취소">
				<input type="button" value="뒤로" onclick="history.back();">
			</td>
		</tr>	
	</table>
	</form>
	
	<%@ include file="../template/footer.jspf" %>
</body>
</html>












