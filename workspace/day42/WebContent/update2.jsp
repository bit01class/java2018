<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		String param1=request.getParameter("idx");
		String param2=request.getParameter("kor");
		String param3=request.getParameter("eng");
		String param4=request.getParameter("math");
		
		///////////////////////
		
		int idx=Integer.parseInt(param1);
		int kor=Integer.parseInt(param2.trim());
		int eng=Integer.parseInt(param3.trim());
		int math=Integer.parseInt(param4.trim());
	
		String sql="update stu set kor="+kor+",eng="+eng+",math="+math+" where idx="+idx;

		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		
		java.sql.Connection conn=null;
		java.sql.Statement stmt=null;
		try{
			Class.forName(driver);
			conn=java.sql.DriverManager.getConnection(url, user, password);
			stmt=conn.createStatement();
			stmt.executeUpdate(sql);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(stmt!=null)stmt.close();
			if(conn!=null)conn.close();
		}
		
		response.sendRedirect(request.getParameter("next"));
	%>
</body>
</html>































