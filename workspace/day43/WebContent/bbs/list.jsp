<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*, java.util.ArrayList, java.util.HashMap"%>
<%@ page errorPage="../err.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="../template/header.jspf" %>
	<%
	ArrayList<HashMap> list = new ArrayList<HashMap>();
	
	String sql="SELECT * FROM EX43 ORDER BY NUM DESC";
	
	try{
		Class.forName(driver);
		conn=DriverManager.getConnection(url, user, password);
		stmt=conn.createStatement();
		rs=stmt.executeQuery(sql);
		while(rs.next()){
			HashMap map=new HashMap();
			map.put("num", rs.getInt("num"));
			map.put("id",rs.getString("id"));
			map.put("sub",rs.getString("sub"));
			map.put("nalja",rs.getDate("nalja"));
			map.put("cnt",rs.getInt("cnt"));
			list.add(map);
		}
	}finally{
		if(rs!=null)rs.close();
		if(stmt!=null)stmt.close();
		if(conn!=null)conn.close();
	}
	
	%>
	<%@ include file="../template/menu.jspf" %>
	<h1>게시판</h1>
	<table border="1" cellspacing="0" width="80%">
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>글쓴이</th>
			<th>날짜</th>
			<th>조회수</th>
		</tr>
		<%
			for(int i=0; i<list.size(); i++){
				HashMap amap=list.get(i);
		%>		
			<tr>
				<td><a href="detail.jsp?num=<%=amap.get("num") %>"><%=amap.get("num") %></a></td>
				<td><a href="detail.jsp?num=<%=amap.get("num") %>"><%=amap.get("sub") %></a></td>
				<td><a href="detail.jsp?num=<%=amap.get("num") %>"><%=amap.get("id") %></a></td>
				<td><a href="detail.jsp?num=<%=amap.get("num") %>"><%=amap.get("nalja") %></a></td>
				<td><a href="detail.jsp?num=<%=amap.get("num") %>"><%=amap.get("cnt") %></a></td>
			</tr>
		<%} %>		
	</table>
	<a href="add.jsp">[글쓰기]</a>
	<%@ include file="../template/footer.jspf" %>
</body>
</html>




















