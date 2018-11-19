<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%
    	String path=request.getParameter("path");
    %>
		<tr height="55">
			<td background="<%=path %>/imgs/bgmenu.png"></td>
			<td background="<%=path %>/imgs/bgmenu.png" width="170"><a href="<%=path %>/content1.jsp"><img style="border:0px" alt="" src="<%=path %>/imgs/menu1.png"></a></td>
			<td align="center" background="<%=path %>/imgs/bgmenu.png" width="170"><a href="<%=path %>/content2.jsp"><img style="border:0px" alt="" src="<%=path %>/imgs/menu2.png"></a></td>
			<td align="center" background="<%=path %>/imgs/bgmenu.png" width="170"><a href="<%=path %>/bbs/list.jsp"><img style="border:0px" alt="" src="<%=path %>/imgs/menu3.png"></a></td>
			<td align="center" background="<%=path %>/imgs/bgmenu.png" width="170"><a href="#"><img style="border:0px" alt="" src="<%=path %>/imgs/menu4.png"></a></td>
			<td background="<%=path %>/imgs/bgmenu.png"></td>
		</tr>
		<tr height="800">
			<td colspan="6" valign="top" align="center">
				<!-- content start -->