<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*"%>
<%!
	Connection conn;
	Statement stmt;
	
	public String valid(String msg){
		msg=msg.replace('-', '─');
		msg=msg.replace('\'', '′');
		msg=msg.replace('\"', '″');
		msg=msg.replace('(', '（');
		msg=msg.replace(')', '）');
		msg=msg.replace('_', '＿');
		msg=msg.replace('%', '％');
		msg=msg.replace(',', '，');
		// + - / * %  _ - , ' " ( ) * & |
		return msg;
	}
%>
<%
String sub=request.getParameter("sub");
String name=request.getParameter("name");
String content=request.getParameter("content");

//검사
sub=sub.trim();
name=name.trim();

String to="5;URL=http://localhost:8080/day39/bbs/list.jsp";
String msg="실패";
if(name.length()>0){

	sub=valid(sub);
	name=valid(name);
	content=valid(content);
	
	String sql="insert into ex39 (num,sub,name,content) values (ex39_seq.nextval,'"
				+sub+"','"+name+"','"+content+"')";
	
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	
	try{
		Class.forName(driver);
		conn=DriverManager.getConnection(url, user, password);
		stmt=conn.createStatement();
		int result=stmt.executeUpdate(sql);
		if(result>0)msg="성공";
	}catch(Exception e){
		System.out.println("sql:"+sql);
		to="3;URL=http://localhost:8080/day39/bbs/add.jsp";	
	}finally{
		if(stmt!=null)stmt.close();
		if(conn!=null)conn.close();
	}
}else{
	to="0;URL=http://localhost:8080/day39/bbs/add.jsp";	
}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<meta http-equiv="refresh" content="<%=to%>">
<title>Insert title here</title>
</head>
<body>

	<h1>입력 <%=msg %></h1>
</body>
</html>
























