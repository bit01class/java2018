<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		String param=request.getParameter("num");
	
		String sql="select max(num) from stu";
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		int max=0;
		int idx=0, num=0, kor=0,eng=0,math=0;
		String name=null;
		
		try{
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, password);
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			if(rs.next()){
				max=rs.getInt(1);
			}
			if(param!=null){
				stmt=conn.createStatement();
				rs=stmt.executeQuery("select * from stu where num="+param);
				if(rs.next()){
					idx=rs.getInt("idx");
					num=rs.getInt("num");
					name=rs.getString("name");
					kor=rs.getInt("kor");
					eng=rs.getInt("eng");
					math=rs.getInt("math");
				}
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
				<p><a href="update.jsp">�����Է�</a></p>
				<p><a href="edit.jsp">��������</a></p>
				<p><a href="rank.jsp">�հ�/����</a></p>
			</td>
			<td>
				<!-- ������� -->
				<form>
				<select name="num">
					<%
					for(int i=0; i<max; i++){
					%>
					<option><%=i+1 %></option>
					<%} %>
				</select>
				<input type="submit" value="��ȸ">
				</form>
				<%
				if(param!=null){
				%>
				<form action="edit2.jsp">
					<input type="hidden" name="idx" value="<%=idx%>">
					<table>
						<tr>
							<th>�й�</th>
							<th>�̸�</th>
							<th>����</th>
							<th>����</th>
							<th>����</th>
							<th></th>
						</tr>
						<tr>
							<td><%=num%></td>
							<td><%=name%></td>
							<td><input type="text" name="kor" value="<%=kor%>"></td>
							<td><input type="text" name="eng" value="<%=eng%>"></td>
							<td><input type="text" name="math" value="<%=math%>"></td>
							<td><input type="submit" value="�� ��"></td>
						</tr>
					</table>
				</form>
				<%} %>
				<!-- ���볡 -->
			</td>
		</tr>
	</table>
</body>
</html>












