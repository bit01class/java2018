<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*, oracle.jdbc.OracleTypes"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>���� ������</h1>
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
	<form action="crud/update.jsp">
		<input type="hidden" value="<%=rs.getInt("num") %>" name="num">
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
				<td colspan="5"><input type="text" name="sub" value="<%=rs.getString("sub") %>"></td>
			</tr>
			<tr>
				<td  bgcolor="#cccccc" height="300"></td>
				<td colspan="5"><textarea name="content" rows="5" cols="60" ><%=rs.getString("content") %></textarea></td>
			</tr>
		</table>
		<input type="submit" value="�� ��">
		<input type="reset" value="�� ��">
	</form>
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







