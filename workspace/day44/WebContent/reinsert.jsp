<%@page import="java.util.concurrent.ExecutionException"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="ora.jspf" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
	String param1=request.getParameter("ref");
	String param2=request.getParameter("lev");
	String param3=request.getParameter("sub");
	String param4=request.getParameter("content");
	String param5=request.getParameter("ord");
	
	//////
	
	int ref=Integer.parseInt(param1);
	int lev=Integer.parseInt(param2);
	int ord=Integer.parseInt(param5);
	String sub="re:"+param3;
	String content=param4;
	if(ord==0){
		String sql="insert into ex44 (num,sub,content,nalja,ref,ord,lev) "
					+"values (ex44_seq.nextval,?,?,sysdate,?,(select max(ord)+1 from ex44 where ref=?),?)";
					
		try{
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, password);
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, sub);
			pstmt.setString(2, content);
			pstmt.setInt(3, ref);
			pstmt.setInt(4, ref);
			pstmt.setInt(5, lev+1);
			pstmt.executeUpdate();
		}finally{
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		}
	}else{
		String sql="update ex44 set ord=ord+1 where ref=? and ord>?";
		String sql2="insert into ex44 (num,sub,content,nalja,ref,ord,lev)"
				+" values (ex44_seq.nextval,?,?,sysdate,?,?,?)";
		try{
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, password);
			conn.setAutoCommit(false);
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, ref);
			pstmt.setInt(2, ord);
			pstmt.executeUpdate();
			pstmt=conn.prepareStatement(sql2);
			pstmt.setString(1, sub);
			pstmt.setString(2, content);
			pstmt.setInt(3, ref);
			pstmt.setInt(4, ord+1);
			pstmt.setInt(5, lev+1);
			pstmt.executeUpdate();
			conn.commit();
		}catch(Exception e){
			conn.rollback();
		}finally{
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		}
	}
	response.sendRedirect("list.jsp");
	%>
</body>
</html>


















