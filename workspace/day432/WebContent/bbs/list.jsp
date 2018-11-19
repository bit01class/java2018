<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*, java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	final String driver="oracle.jdbc.driver.OracleDriver";
	final String url="jdbc:oracle:thin:@localhost:1521:xe";
	final String user="scott";
	final String password="tiger";
	
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	
	String sql="SELECT * FROM EX43 ORDER BY NUM DESC";
	ArrayList<HashMap<String,Object>> list = new ArrayList<HashMap<String,Object>>();
	
	try{
		Class.forName(driver);
		conn=DriverManager.getConnection(url, user, password);
		pstmt=conn.prepareStatement(sql);
		rs=pstmt.executeQuery();
		while(rs.next()){
			HashMap<String,Object> map=new HashMap<String,Object>();
			map.put("num", rs.getInt("num"));
			map.put("sub", rs.getString("sub"));
			map.put("id", rs.getString("id"));
			map.put("nalja",rs.getDate("nalja"));
			map.put("cnt",rs.getInt("cnt"));
			list.add(map);
		}
	}finally{
		if(rs!=null)rs.close();
		if(pstmt!=null)pstmt.close();
		if(conn!=null)conn.close();
	}
	
%>
	<jsp:include page="../template/header.jsp"></jsp:include>
	<jsp:include page="../template/menu.jsp">
		<jsp:param value=".." name="path"/>
	</jsp:include>
	<h1>리스트 페이지</h1>
	<table width="80%" align="center" border="1" cellspacing="0">
		<tr>
			<th width="80">글번호</th>
			<th>제목</th>
			<th width="80">글쓴이</th>
			<th width="120">날짜</th>
			<th width="80">조회수</th>
		</tr>
		
		<%
			for(int i=0; i<list.size(); i++){
				HashMap<String,Object> map=list.get(i);
		%>
		<tr>
			<td><%=map.get("num") %></td>
			<td><%=map.get("sub") %></td>
			<td><%=map.get("id") %></td>
			<td><%=map.get("nalja") %></td>
			<td><%=map.get("cnt") %></td>
		</tr>
		<%} %>
	</table>
	
	
	<jsp:include page="../template/footer.jsp"></jsp:include>
</body>
</html>