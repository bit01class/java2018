<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.ArrayList, java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	ArrayList list = new ArrayList();
	String sql="select * from stu order by num";
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	
	Connection conn=null;
	Statement stmt=null;
	ResultSet rs=null;
	try{
		Class.forName(driver);
		conn=DriverManager.getConnection(url, user, password);
		stmt=conn.createStatement();
		rs=stmt.executeQuery(sql);
		while(rs.next()){
			list.add(rs.getInt("num"));
			list.add(rs.getString("name"));
			list.add(rs.getInt("kor"));
			list.add(rs.getInt("eng"));
			list.add(rs.getInt("math"));
			list.add(rs.getInt("idx"));
		}
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		if(rs!=null)rs.close();
		if(stmt!=null)stmt.close();
		if(conn!=null)conn.close();
	}
%>
	<table width="800" align="center">
		<tr>
			<td colspan="2" bgcolor="gray">
				<h1>학생성적관리프로그램</h1>
			</td>
		</tr>
		<tr>
			<td width="150" bgcolor="#cccccc">
				<p><a href="index.jsp">처음으로</a></p>
				<p><a href="update.jsp">성적입력</a></p>
				<p><a href="edit.jsp">성적수정</a></p>
				<p><a href="rank.jsp">합계/순위</a></p>
			</td>
			<td>
				<!-- 내용시작 -->
				<table align="center" width="80%" border="1" cellspacing="0">
					<tr>
						<th>학번</th>
						<th>이름</th>
						<th width="50">국어</th>
						<th width="50">영어</th>
						<th width="50">수학</th>
						<th width="50">삭제</th>
					</tr>
					<%
					
					for(int i=0; i<list.size(); i++){
					%>
					<tr>
						<td><%=list.get(i++) %></td>
						<td><%=list.get(i++) %></td>
						<td><%=list.get(i++) %></td>
						<td><%=list.get(i++) %></td>
						<td><%=list.get(i++) %></td>
						<td>
							<form action="del.jsp">
								<input type="hidden" name="idx" value="<%=list.get(i) %>">
								<input type="submit" value="삭제">
							</form>
						</td>
					</tr>
					<%} %>
				</table>
				
				<form action="insert.jsp">
					<input type="text" name="name">
					<input type="submit" value="학생등록">				
				</form>
				<!-- 내용끝 -->
			</td>
		</tr>
	</table>
</body>
</html>












