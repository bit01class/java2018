<%@page import="oracle.jdbc.OracleTypes"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>�� ������</h1>
	<%
	String param=request.getParameter("num");
	int num=Integer.parseInt(param);
	///
	String sql="{call ex40_one(?,?)}";
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	
	Connection conn=null;
	CallableStatement cstmt=null;
	ResultSet rs=null;
	try{
		Class.forName(driver);
		conn=DriverManager.getConnection(url, user, password);
		cstmt=conn.prepareCall(sql);
		cstmt.setInt(1, num);
		cstmt.registerOutParameter(2, OracleTypes.CURSOR);
		cstmt.execute();
		rs=(ResultSet)cstmt.getObject(2);
		if(rs.next()){
	%>
	<table width="800">
		<tr>
			<td bgcolor="#cccccc" width="100">�۹�ȣ</td>
			<td><%=rs.getInt("num") %></td>
			<td bgcolor="#cccccc" width="100">�۾���</td>
			<td><%=rs.getString("name") %></td>
			<td bgcolor="#cccccc" width="100">��¥</td>
			<td><%=rs.getDate("nalja") %></td>
		</tr>
		<tr>
			<td bgcolor="#cccccc">����</td>
			<td colspan="5"><%=rs.getString("sub") %></td>
		</tr>
		<tr>
			<td  bgcolor="#cccccc" height="300"></td>
			<td colspan="5"><%=rs.getString("content") %></td>
		</tr>
	</table>
	<a href="edit.jsp?num=<%=num%>">[�� ��]</a>
	<a href="./crud/del.jsp?num=<%=num%>">[�� ��]</a>
	<%
		}
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		if(rs!=null)rs.close();
		if(cstmt!=null)cstmt.close();
		if(conn!=null)conn.close();
	}
	%>
</body>
</html>




















