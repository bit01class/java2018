<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body background="./imgs/bg.jpg">
	<table border="1" cellspacing="0" width="800" align="center" bgcolor="#ffffff">
		<tr>
			<td colspan="2">
			<img src="./imgs/logo.jpg" alt="logo">
			</td>
		</tr>
		<tr>
			<td width="150">
			<p><a href="menu1.jsp">ȸ��Ұ�</a></p>
			<p><a href="menu2.jsp">���ô±�</a></p>
			<p><a href="list.jsp">�Խ���</a></p>
			<p><a href="list2.jsp">����</a></p>
			</td>
			<td>
				<h1 align="center">����</h1>
				<%
				String sql="SELECT * FROM EX37";
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
				%>
				<p>[<%=rs.getDate(2) %>]<%=rs.getString(1) %></p>
				<%
					}
				}finally{
					if(rs!=null)rs.close();
					if(stmt!=null)stmt.close();
					if(conn!=null)conn.close();
				}
				%>
				<form action="insert2.jsp">
					<textarea rows="2" cols="40" name="content"></textarea>
					<input type="submit" value="�Է�">
				</form>
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
			��Ʈķ�� ����� ���ʱ� ���ʵ� 1327-15 ��Ʈ��ī���̺���<br>
			(��)��Ʈ��ǻ�� �������� ��ǥ�̻� : ������<br> 
			Copyright &copy; ��Ʈķ�� All rights reserved.<br>
			</td>
		</tr>
	</table>
</body>
</html>











