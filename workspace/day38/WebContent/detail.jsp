<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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
			<p><a href="#">�����</a></p>
			</td>
			<td>
				<h1 align="center">��������</h1>
				<%
				String num=request.getParameter("num");
				String sql="SELECT NAME,NALJA,SUB,CONTENT FROM BBS01 WHERE NUM="+num;
				String driver="oracle.jdbc.driver.OracleDriver";
				String url="jdbc:oracle:thin:@localhost:1521:xe";
				String user="scott";
				String password="tiger";
				
				String name="";
				java.sql.Date nalja=null;
				String sub="";
				String content="";
				
				Connection conn=null;
				Statement stmt=null;
				ResultSet rs=null;
				try{
					Class.forName(driver);
					conn=DriverManager.getConnection(url, user, password);
					stmt=conn.createStatement();
					rs=stmt.executeQuery(sql);
					if(rs.next()){
						name=rs.getString(1);
						nalja=rs.getDate(2);
						sub=rs.getString(3);
						content=rs.getString(4);
					}
				}catch(Exception e){
					
				}finally{
					if(rs!=null)rs.close();
					if(stmt!=null)stmt.close();
					if(conn!=null)conn.close();
				}
				
				
				%>
				<table border="1" width="80%" align="center">
					<tr>
						<td width="50">��ȣ</td>
						<td><%=num%></td>
						<td width="80">�۾���</td>
						<td><%=name %></td>
						<td width="50">��¥</td>
						<td><%=nalja %></td>
					</tr>
					<tr>
						<td>����</td>
						<td colspan="5"><%=sub %></td>
					</tr>
					<tr>
						<td colspan="6"><%=content %></td>
					</tr>
				</table>
				<a href="edit.jsp?num=<%=num %>">[�� ��]</a>
				<a href="del.jsp?num=<%=num %>">[�� ��]</a>
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










