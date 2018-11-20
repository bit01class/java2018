<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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
	String sub=null,content=null,writer=null,nalja=null;
	String param=request.getParameter("idx");
	int num=Integer.parseInt(param);
	String sql="SELECT NUM,(SELECT ID FROM USER04 WHERE NUM=WRITER),NALJA,SUB,CONTENT FROM BBS04 WHERE NUM=?";
	try{
		newConnection();
		pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1, num);
		rs=pstmt.executeQuery();
		if(rs.next()){
			sub=rs.getString("sub");
			content=rs.getString("content");
			writer=rs.getString(2);
			nalja=rs.getDate("nalja").toString();
		}
	}finally{
		if(rs!=null)rs.close();
		if(pstmt!=null)pstmt.close();
		if(conn!=null)conn.close();
	}
	%>
	<h1>�� ������</h1>
	<table>
		<tr>
			<td>�۹�ȣ</td>
			<td><%=num %></td>
			<td>�۾���</td>
			<td><%=writer %></td>
			<td>��¥</td>
			<td><%=nalja %></td>
		</tr>
		<tr>
			<td>����</td>
			<td colspan="5"><%=sub %></td>
		</tr>
		<tr>
			<td>����</td>
			<td colspan="5"><%=content %></td>
		</tr>
		<tr>
			<td colspan="6">
				<a href="#">[����]</a>
				<a href="#">[����]</a>
			</td>
		</tr>
	</table>
</body>
</html>











