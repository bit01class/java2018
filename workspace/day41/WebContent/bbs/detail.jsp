<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
String no=request.getParameter("num");
int num=0;
try{
	num=Integer.parseInt(no.trim());
}catch(Exception e){
	out.println("<h1>Error) �ش��������� �������� �ʽ��ϴ�</h1>");
	out.println("<a href=\"list.jsp\">�ڷ�</a>");
	return;
}

%>
	<h1>�� ������</h1>
<%

String sql="select * from ex41_bbs where num="+num;

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
%>
<p>
���ּ�:http://localhost:8080<%=request.getRequestURI() %>?num=<%=num %>
</p>
	<table width="800">
		<tr>
			<td width="100" bgcolor="gray">�۹�ȣ</td>
			<td><%=rs.getInt("num") %></td>
			<td width="100" bgcolor="gray">�۾���</td>
			<td><%=rs.getString("name") %></td>
			<td width="100" bgcolor="gray">��¥</td>
			<td><%=rs.getDate("nalja") %></td>
		</tr>
		<tr>
			<td width="100" bgcolor="gray">����</td>
			<td><%=rs.getString("sub") %></td>
		</tr>
		<tr>
			<td width="100" bgcolor="gray"></td>
			<td><%=rs.getString("content") %></td>
		</tr>
<%
	}
}catch(Exception e){
	
}finally{
	if(rs!=null)rs.close();
	if(stmt!=null)stmt.close();
	if(conn!=null)conn.close();
}
%>
		<tr>
			<td>
				<a href="edit.jsp?num=<%=num%>">[�� ��]</a>
				<a href="del.jsp?num=<%=num%>">[�� ��]</a>
			</td>
		</tr>
	</table>
</body>
</html>












