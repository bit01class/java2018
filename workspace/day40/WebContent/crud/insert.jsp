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
	String name=request.getParameter("name");
	String sub=request.getParameter("sub");
	String content=request.getParameter("content");
	
	String sql="{call ex40_insert('"+name+"','"+sub+"','"+content+"')}";
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	
	Connection conn=null;
	CallableStatement cstmt=null;
	try{
		Class.forName(driver);
		conn=DriverManager.getConnection(url, user, password);
		cstmt=conn.prepareCall(sql);
		cstmt.execute();
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		if(cstmt!=null)cstmt.close();
		if(conn!=null)conn.close();
	}
	String root=request.getContextPath();
	response.sendRedirect(root);
	//response.sendRedirect("/day40");
	%>
</body>
</html>
















