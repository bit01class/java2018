<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="private.jspf" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
	if("GET".equals(request.getMethod())){
	%>
	<h1>ERR) �߸��� �����Դϴ�</h1>
	<%}else{
		String sql="insert into ex43 values (ex43_seq.nextval,?,?,?,sysdate,0)";		
		
		try{
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, password);
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, request.getParameter("id"));
			pstmt.setString(2, request.getParameter("sub"));
			pstmt.setString(3, request.getParameter("content"));
			pstmt.executeUpdate();
		}finally{
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		}
	 %>
	<jsp:forward page="list.jsp"></jsp:forward>
	<%} %>
</body>
</html>



















