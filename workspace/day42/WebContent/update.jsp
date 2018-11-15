<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
//	String sql="select * from stu where kor=0 and eng=0 and math=0 order by num";
	String sql="select idx,num,name from (select idx,num,name from stu where kor=0 and eng=0 and math=0 order by num)";
	sql+=" where num=(select min(num) from stu where kor=0 and eng=0 and math=0)";
	
	int idx=0,num=0,cnt=0;
	String name=null;
	
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
		if(rs.next()){
			cnt++;
			idx=rs.getInt(1);
			num=rs.getInt(2);
			name=rs.getString(3);
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
				<%
				if(cnt>0){
				%>
				<h1>(학번 : <%=num %>)<%=name %></h1>
				<form action="update2.jsp">
					<input type="hidden" name="next" value="update.jsp">
					<input type="hidden" name="idx" value="<%=idx%>">
					<table>
						<tr>
							<th>국어</th>
							<th>영어</th>
							<th>수학</th>
							<th></th>
						</tr>				
						<tr>
							<td><input type="text" name="kor" size="5"></td>
							<td><input type="text" name="eng" size="5"></td>
							<td><input type="text" name="math" size="5"></td>
							<td>
								<input type="submit" value="입 력">
							</td>
						</tr>
					</table>
				</form>
				<%
				}else{
				%>
					<h1>더이상 입력하실 학생이 없습니다</h1>
				<%} %>
				<!-- 내용끝 -->
			</td>
		</tr>
	</table>
</body>
</html>












