<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>리스트 페이지</h1>
<table width="800">
	<tr>
		<th>글번호</th>
		<th>제목</th>
		<th>글쓴이</th>
		<th>날짜</th>
	</tr>
	<%
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	
	Connection conn=null;
	CallableStatement cstmt=null;
	ResultSet rs=null;
	try{
		Class.forName(driver);
		conn=DriverManager.getConnection(url,user,password);
		cstmt=conn.prepareCall("{call ex40_all(?)}");
		cstmt.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
		cstmt.execute();
		rs=(ResultSet)cstmt.getObject(1);
		while(rs.next()){
	%>
	<tr>
		<td><%=rs.getInt("num") %></td>
		<td><%=rs.getString("sub") %></td>
		<td><%=rs.getString("name") %></td>
		<td><%=rs.getDate("nalja") %></td>
	</tr>
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
</table>


<a href="add.jsp">[입 력]</a>
</body>
</html>










