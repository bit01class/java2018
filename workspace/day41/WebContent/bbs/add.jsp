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
System.out.println("method:"+request.getMethod());
if(request.getMethod().equals("POST")){
	// insert
	request.setCharacterEncoding("EUC-KR");
	
	String param1=request.getParameter("sub");
	String param2=request.getParameter("name");
	String param3=request.getParameter("content");
	
	// 
	
	String name=param2.trim();
	String sub=param1.trim();
	String content=param3;
	
	if("".equals(name)){//param2==null){
		response.sendRedirect("add.jsp?err=true");
		return;
	}
	if("".equals(sub)){//param2==null){
		sub="제목없음";
	}
	if("".equals(content)){//param2==null){
		content="-";
	}
	String sql="insert into ex41_bbs values (ex41_bbs_seq.nextval,'"
				+name+"','"+sub+"','"+content+"',sysdate,0)";
	System.out.println(sql);
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	
	Connection conn=null;
	Statement stmt=null;
	try{
		Class.forName(driver);
		conn=DriverManager.getConnection(url, user, password);
		stmt=conn.createStatement();
		stmt.executeUpdate(sql);
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		if(stmt!=null)stmt.close();
		if(conn!=null)conn.close();
	}
	response.sendRedirect("list.jsp");
	return;
}

%>
	<h1>입력 페이지</h1>
	<form method="post">
		<table width="800">
			<tr>
				<td>제목</td>
				<td>
					<input type="text" name="sub">
				</td>
			</tr>
			<tr>
				<td>글쓴이</td>
				<td>
					<input type="text" name="name">
					<%
					if("true".equals(request.getParameter("err"))){
					//if(request.getParameter("err")!=null){
					//if(request.getParameter("err").equals("true")){
					%>
					<font color="red">[비었음]</font>
					<%
					}
					%>
				</td>
			</tr>
			<tr>
				<td></td>
				<td>
					<textarea rows="5" cols="60" name="content"></textarea>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="입 력">
					<input type="reset" value="취 소">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>









