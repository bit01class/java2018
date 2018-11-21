<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*,com.bit.day45.bbs.MyOra"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="bean" class="com.bit.day45.bbs.JavaBean"></jsp:useBean>
	<jsp:setProperty property="num" name="bean"/>
	
	<%
		String sql="SELECT * FROM BBS05 WHERE NUM=?";
	
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try{
			MyOra my=new MyOra();
			conn=my.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, bean.getNum());
			rs=pstmt.executeQuery();
			if(rs.next()){
				bean.setSub(rs.getString("sub"));
				bean.setName(rs.getString("name"));
				bean.setContent(rs.getString("content"));
				bean.setNalja(rs.getDate("nalja"));
			}
		}finally{
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		}
	%>
	
	<h1>detail page</h1>
	<table width="1024">
		<tr>
			<td>글번호</td>
			<td><jsp:getProperty property="num" name="bean"/> </td>
			<td>이름</td>
			<td><jsp:getProperty property="name" name="bean"/> </td>
			<td>날짜</td>
			<td><jsp:getProperty property="nalja" name="bean"/> </td>
		</tr>
		<tr>
			<td>제목</td>
			<td colspan="5"><jsp:getProperty property="sub" name="bean"/> </td>
		</tr>
		<tr>
			<td>내용</td>
			<td colspan="5"><jsp:getProperty property="content" name="bean"/> </td>
		</tr>
		<tr>
			<td colspan="6">
			<a href="edit.jsp?num=<%=bean.getNum()%>&name=<%=bean.getName()%>&sub=<%=bean.getSub()%>&content=<%=bean.getContent()%>">[수정1]</a>
			<a href="">[수정2]</a>
			</td>
		</tr>
	</table>
</body>
</html>



















