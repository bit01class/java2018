<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>전달하는 페이지</h1>
	<form action="ex08.jsp">
		id<input type="text" name="id"><br>
		ch1<input type="checkbox" name="ch" value="ch1">
		ch2<input type="checkbox" name="ch" value="ch2">
		ch3<input type="checkbox" name="ch" value="ch3"><br>
		ra1<input type="radio" name="ra" value="ra1">
		ra2<input type="radio" name="ra" value="ra2">
		ra3<input type="radio" name="ra" value="ra3"><br>
		<select name="sel" size="4" multiple="multiple">
			<option value="i1">item1</option>
			<option value="i2">item2</option>
			<option value="i3">item3</option>
			<option value="i4">item4</option>
		</select><br>
		<textarea rows="5" cols="20" name="ar"></textarea><br>
		
		<input type="submit" value="전달">
	</form>
</body>
</html>






















