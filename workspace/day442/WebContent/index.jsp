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
	String pname="main";
	String id="guest";
	
	if(request.getParameter("id")!=null){
		id=request.getParameter("id");
	}

	if(request.getParameter("pname")!=null){
		pname=request.getParameter("pname");
	}
	
	pname+=".jsp";
%>
	<table width="1024" border="0"  align="center">
		<tr>
			<td colspan="7" align="center">
				<a href="index.jsp?pname=main"><img alt="logo" src="imgs/logo.png"></a>
			</td>
		</tr>
		<tr>
			<td></td>
			<td align="center" width="120"><a href="index.jsp?id=<%=id %>&pname=menu1">[��&nbsp;&nbsp;&nbsp;&nbsp;��]</a></td>
			<td align="center" width="120"><a href="index.jsp?id=<%=id %>&pname=menu2">[���ô±�]</a></td>
			<td align="center" width="120"><a href="index.jsp?id=<%=id %>&pname=list">[��&nbsp;��&nbsp;��]</a></td>
			<%if("guest".equals(id)){ %>
			<td align="center" width="120"><a href="index.jsp?id=<%=id %>&pname=login">[��&nbsp;��&nbsp;��]</a></td>
			<%}else{ %>
			<td align="center" width="120"><a href="index.jsp?id=<%=id %>&pname=login">[�α׾ƿ�]</a></td>
			<%} %>
			<td align="center" width="120"><a href="index.jsp">[ȸ������]</a></td>
			<td align="center"></td>
		</tr>
		<tr>
			<td colspan="7" align="center">
				<!-- <img src="imgs/main.png"> -->
				<!-- <img src="imgs/content1.jpg"> -->
				<!-- <img src="imgs/main.png"> -->
				<jsp:include page="<%=pname %>">
					<jsp:param value="<%=id %>" name="id"/>
				</jsp:include>
			</td>
		</tr>
		<tr>
			<td colspan="7" align="center">
			Copyright &copy; ��Ʈķ�� All rights reserved.
			</td>
		</tr>
	</table>
</body>
</html>








