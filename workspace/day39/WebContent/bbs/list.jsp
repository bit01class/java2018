<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*, java.text.SimpleDateFormat"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>����Ʈ ������</h1>
	<table width="80%" border="1" cellspacing="0">
		<tr>
			<th>�۹�ȣ</th>
			<th>����</th>
			<th>�۾���</th>
			<th>��¥</th>
			<th>��ȸ��</th>
		</tr>
		<%!
		Connection conn;
		Statement stmt;
		ResultSet rs;
		%>
		<%
		String sql ="SELECT NUM,SUB,NAME,NALJA,CNT FROM EX39 ORDER BY NUM DESC";
		String driver ="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		
		SimpleDateFormat sdf=new SimpleDateFormat("yy/MM/dd");
		
		try{
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, password);
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()){
		%>
		<tr>
			<td><%=rs.getInt(1) %></td>
			<td><%=rs.getString(2) %></td>
			<td><%=rs.getString(3) %></td>
			<td><%=sdf.format(rs.getDate(4))%></td>
			<td><%=rs.getInt(5) %></td>
		</tr>
		<%
			}
		}catch(Exception ex){
			
		}finally{
			if(rs!=null)rs.close();
			if(stmt!=null)stmt.close();
			if(conn!=null)conn.close();
		}
		
		%>
	</table>
	
	
	<form action="add.jsp">
		<input type="submit" value="�� ��">
	</form>
</body>
</html>




















