<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.*"%>
    
<%@ include file="connection.jspf" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
String id=request.getParameter("id");
ArrayList<HashMap<String,String>> list = new ArrayList<HashMap<String,String>>();

String sql="SELECT NUM,SUB,NALJA,(select id from user04 where num=writer) as id "
				+" FROM BBS04 ORDER BY NUM DESC";
	try{
		newConnection();
		pstmt=conn.prepareStatement(sql);
		rs=pstmt.executeQuery();
		while(rs.next()){
			HashMap<String,String> map = new HashMap<String,String>();
			map.put("num", rs.getInt("num")+"");
			map.put("sub", rs.getString("sub"));
			map.put("nalja", rs.getDate("nalja").toString());
			map.put("writer", rs.getString("id"));			
			list.add(map);
		}
	}finally{
		if(rs!=null)rs.close();
		if(pstmt!=null)pstmt.close();
		if(conn!=null)conn.close();
	}
%>

	<h1>리스트 페이지</h1>
	<table width="80%" border="1" cellspacing="0">
		<tr>
			<th>글번호</th>
			<th>제 목</th>
			<th>글쓴이</th>
			<th>날짜</th>
		</tr>
		<%
		//for(int i=0; i<list.size(); i++){
			//HashMap<String,String> map =list.get(i);
			Iterator<HashMap<String,String>> ite=list.iterator();
			while(ite.hasNext()){
				HashMap<String,String> map =ite.next();
		%>
		<tr>
			<td><a href="index.jsp?id=<%=id %>&pname=detail&idx=<%=map.get("num") %>"><%=map.get("num") %></a></td>
			<td><a href="index.jsp?id=<%=id %>&pname=detail&idx=<%=map.get("num") %>"><%=map.get("sub") %></a></td>
			<td><a href="index.jsp?id=<%=id %>&pname=detail&idx=<%=map.get("num") %>"><%=map.get("writer") %></a></td>
			<td><a href="index.jsp?id=<%=id %>&pname=detail&idx=<%=map.get("num") %>"><%=map.get("nalja") %></a></td>
		</tr>
		<%} %>
	</table>
	<a href="index.jsp?id=<%=id %>&pname=add">[입 력]</a>
</body>
</html>














