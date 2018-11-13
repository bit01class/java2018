<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*"%>
<%
String param1=request.getParameter("num");
String param2=request.getParameter("sub");
String param3=request.getParameter("content");

int num=Integer.parseInt(param1);
String sub=param2.trim();
String content=param3.trim();
// update ex40 set ~~ where num=

String sql="{call ex40_update(?,?,?,?)}";
String driver="oracle.jdbc.driver.OracleDriver";
String url="jdbc:oracle:thin:@localhost:1521:xe";
String user="scott";
String password="tiger";

Connection conn=null;
CallableStatement cstmt=null;
int result=0;
try{
	Class.forName(driver);
	conn=DriverManager.getConnection(url, user, password);
	cstmt=conn.prepareCall(sql);
	cstmt.setString(1, sub);
	cstmt.setString(2, content);
	cstmt.setInt(3, num);
	cstmt.registerOutParameter(4, Types.INTEGER);
	cstmt.execute();
	result=cstmt.getInt(4);
	/// redirect(~~~)
	System.out.println("result="+result);
}catch(Exception e){
	e.printStackTrace();
}finally{
	if(cstmt!=null)cstmt.close();
	if(conn!=null)conn.close();
}
if(result>0){
	//http://localhost:8080/day40/detail.jsp?num=8
	response.sendRedirect("/day40/detail.jsp?num="+num);
}else{
	//http://localhost:8080/day40/edit.jsp?num=8
	response.sendRedirect("/day40/edit.jsp?num="+num);
}
%>
















