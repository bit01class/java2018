<%@page import="java.util.Iterator"%>
<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>id:<%=request.getParameter("id") %></h1>
	<h1>ch1:<%=request.getParameter("ch1") %></h1>
	<h1>ch2:<%=request.getParameter("ch2") %></h1>
	<h1>ch3:<%=request.getParameter("ch3") %></h1>
	<h1>radio:<%=request.getParameter("ra") %></h1>
	<h1>select:<%=request.getParameter("sel") %></h1>
	<%
	String[] ch = request.getParameterValues("ch");
	for(int i=0; i<ch.length; i++){
		out.println("<h1>"+ch[i]+"</h1>");
	}
	/* 
		Enumeration vac =request.getParameterNames();
		while(vac.hasMoreElements()){
			System.out.println(vac.nextElement());
		}
	 */
	java.util.Map<String,String[]> map=request.getParameterMap();
	java.util.Set<String> keys=map.keySet();
	Iterator<String> ite= keys.iterator();
	while(ite.hasNext()){
		String key=ite.next();
		//System.out.println(key+":"+request.getParameter(key));
		String[] vals=request.getParameterValues(key);
		for(int i=0; i<vals.length; i++){
			System.out.println(key+":"+vals[i]);
		}
	}
	System.out.println("-----------------------------");
	System.out.println(request.getParameter("ar"));
	String msg=request.getParameter("ar");
	//msg=msg.replace("\n", "<br>");
	
	
	%>
	<pre><%=msg %></pre>
</body>
</html>














