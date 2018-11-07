<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>구구단</h1>
	<table border="1">
			<tr>
			<%
			for(int i=0; i<8; i++){
				out.println("<td>"+(2+i)+"단</td>");
			}
			%>
			</tr>
			<%
			for(int i=0; i<9; i++){
				out.println("<tr>");
				for(int j=0; j<8; j++){
					out.println("<td>"+(j+2)+"x"+(i+1)+"="+(j+2)*(i+1)+"</td>");
				}
				out.println("</tr>");
			}
			%>
	</table>
</body>
</html>














