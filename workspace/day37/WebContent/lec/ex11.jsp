<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<%! 
	public int gub(int a, int b){
		return a*b;
	}
%>
<body>
	<h1>������</h1>
	<table border="1">
		<tr>
			<%for(int i=2; i<10; i++){ %>
			<td><%=i %>��</td>
			<%} %>
		</tr>
		<%for(int i=1; i<10; i++){ %>
		<tr>
			<%for(int j=2; j<10; j++){ %>
			<td><%=j%>x<%=i %>=<%=gub(i,j) %></td>
			<%} %>
		</tr>
		<%} %>
	</table>
</body>
</html>


























