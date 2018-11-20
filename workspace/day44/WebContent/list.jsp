<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.*" %>    
<%@ include file="ora.jspf" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
	ArrayList<HashMap<String,String>> list = new ArrayList<HashMap<String,String>>();
	String sql="SELECT * FROM EX44 ORDER BY REF DESC, ORD ASC";
		try{
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, password);
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()){
				HashMap<String,String> map=new HashMap<String,String>();
				map.put("num", rs.getInt("num")+"");
				map.put("sub", rs.getString("sub"));
				map.put("nalja", rs.getDate("nalja").toString());
				map.put("lev",rs.getInt("lev")+"");
				list.add(map);
			}
		}finally{
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		}
	%>
	<h1>리스트 페이지</h1>
	<table>
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>날짜</th>
		</tr>
		<% 
			for(int i=0; i<list.size(); i++){
				HashMap<String,String> map=list.get(i);
		%>
		<tr>
			<td><a href="detail.jsp?idx=<%=map.get("num") %>"><%=map.get("num") %></a></td>
			<td><%
			int sp=Integer.parseInt(map.get("lev"));
			for(int j=0; j<sp; j++){
				out.print("&nbsp;&nbsp;&nbsp;");
			}
			if(sp!=0)out.print("┗");
			%><a href="detail.jsp?idx=<%=map.get("num") %>"><%=map.get("sub") %></a></td>
			<td><a href="detail.jsp?idx=<%=map.get("num") %>"><%=map.get("nalja") %></a></td>
		</tr>
		<%} %>	
	</table>
	<a href="add.jsp">[입 력]</a>
</body>
</html>












