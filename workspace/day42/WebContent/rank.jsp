<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*, java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
	//kor,eng,math
	String sql="select rank() over (order by tot desc) as \"ranking\", num,name,tot "
				+" from (select num,name,kor+eng+math as tot from stu)";
	
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	
	ArrayList<String[]> list =new ArrayList<String[]>();
	Connection conn=null;
	Statement stmt=null;
	ResultSet rs=null;
	
	try{
		Class.forName(driver);
		conn=DriverManager.getConnection(url, user, password);
		stmt=conn.createStatement();
		rs=stmt.executeQuery(sql);
		while(rs.next()){
			String[] arr =new String[4];
			arr[0]=rs.getString("ranking");
			arr[1]=rs.getString("num");
			arr[2]=rs.getString("name");
			arr[3]=rs.getString("tot");			
			list.add(arr);
		}
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		if(rs!=null)rs.close();
		if(stmt!=null)stmt.close();
		if(conn!=null)conn.close();
	}
	
	%>
	<table width="800" align="center">
		<tr>
			<td colspan="2" bgcolor="gray">
				<h1>�л������������α׷�</h1>
			</td>
		</tr>
		<tr>
			<td width="150" bgcolor="#cccccc">
				<p><a href="index.jsp">ó������</a></p>
				<p><a href="update.jsp">�����Է�</a></p>
				<p><a href="edit.jsp">��������</a></p>
				<p><a href="rank.jsp">�հ�/����</a></p>
			</td>
			<td>
				<!-- ������� -->
				<table>
					<tr>
						<th>����</th>
						<th>�й�</th>
						<th>�̸�</th>
						<th>����</th>
					</tr>
					<% 
					for(int i=0; i<list.size(); i++){
						String[] row=list.get(i);
					%>
					<tr>
						<td><%=row[0] %></td>
						<td><%=row[1] %></td>
						<td><%=row[2] %></td>
						<td><%=row[3] %></td>
					</tr>
					<%
					}
					%>
				</table>
				<!-- ���볡 -->
			</td>
		</tr>
	</table>
</body>
</html>












