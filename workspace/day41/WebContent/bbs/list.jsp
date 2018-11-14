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
int tot=0;
String limitTemp=request.getParameter("limit");
if(limitTemp==null){
	limitTemp="10";
}
int limit=Integer.parseInt(limitTemp);
String pageNo=request.getParameter("page");
if(pageNo==null){
	pageNo="1";
}
int p=1+limit*(Integer.parseInt(pageNo)-1);

String search=request.getParameter("search");
if(search==null){
	search="";
}
String keyword=search.trim();

%>
	<h1>리스트 페이지</h1>
	<form>
		<select name="limit">
			<option value="5" <% if(limit==5)out.print("selected=\"selected\""); %>>5개씩 보기</option>
			<option value="10" <% if(limit==10)out.print("selected=\"selected\""); %>>10개씩 보기</option>
			<option value="25" <% if(limit==25)out.print("selected=\"selected\""); %>>25개씩 보기</option>
			<option class="50" <% if(limit==50)out.print("selected=\"selected\""); %>>50개씩 보기</option>
		</select>
		<input type="submit" value="보기">
	</form>
	<table width="800">
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>글쓴이</th>
			<th>날짜</th>
			<th>조회수</th>
		</tr>
		<%
		String sql="select * from "
					+" (select rownum as rn, num,sub,name,nalja,cnt from "
					+" (select * from ex41_bbs where name like '%"+keyword+"%' order by num desc)) "
					+" where rn between "+p+" and "+p+"+("+limit+"-1)";
		//System.out.println(sql);		
					//////////////////////////////////////////////////////////////
					//"select * from ex41_bbs where num between "
					//+"(select max(num)-10*"+p+"-9 from ex41_bbs) "
					//+"and (select max(num)-10*"+p+" from ex41_bbs)"
					//+"(select max(num)10*0-9 from ex41_bbs) and (select max(num)-10*0 from ex41_bbs)"
					//+"92 and 101"
					//+"(select max(num)-10*1-9 from ex41_bbs) and (select max(num)-10*1 from ex41_bbs)"
					//+"82 and 91"
					//+"(select max(num)-10*2-9 from ex41_bbs) and (select max(num)-10*2 from ex41_bbs)"
					//+"72 and 81"
					//+" order by num desc";
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		try{
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, password);
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()){
		%>
		<tr>
			<td><%=rs.getInt("num") %></td>
			<td><%=rs.getString("sub") %></td>
			<td><%=rs.getString("name") %></td>
			<td><%=rs.getDate("nalja") %></td>
			<td><%=rs.getInt("cnt") %></td>
		</tr>
		<%
			}
			
			stmt=conn.createStatement();
			rs=stmt.executeQuery("SELECT COUNT(*) AS TOT FROM EX41_BBS where name like '%"+keyword+"%'");
			if(rs.next()){
				tot=rs.getInt("tot");
			}
		}catch(Exception e){
			
		}finally{
			if(rs!=null)rs.close();
			if(stmt!=null)stmt.close();
			if(conn!=null)conn.close();
		}
		// 1+5*0 - 1,2,3,4,5 -> (0,1,2,3,4     +1)/5 -> (page-1)/5
		// 1+5*1 - 6,7,8,9,10	-> (5,6,7,8,9  +1)/5
		// 1+5*2 - 11,12,13,14,15 -> (10,11,12,13,14 +1)/5
		// 1+5*3 - 16,17,18,19
		// 1+5*(page-1)/5
		
		int start=1+5*((Integer.parseInt(pageNo)-1)/5);
		System.out.println("start:"+start);
		int end=0;
		if(start+4<=((tot-1)/limit)+1){
			end=start+4;//((tot-1)/limit)+1;
		}else{
			end=((tot-1)/limit)+1;
		}
		%>
		<tr>
			<td colspan="5" align="center">
			<%
			if(start!=1){
			%>
			<a href="list.jsp?page=<%=start-1%>&limit=<%=limit%>&search=<%=keyword%>">[이전]</a>
			<%
			}
			for(int i=start; i<=end; i++){
				if(i!=Integer.parseInt(pageNo)){
			%>
				<a href="list.jsp?page=<%=i%>&limit=<%=limit%>&search=<%=keyword%>">[<%=i %>]</a>
			<%
				}else{
					out.print("["+i+"]");
				}
			}
			if(end<((tot-1)/limit)+1){
			%>
			<a href="list.jsp?page=<%=end+1%>&limit=<%=limit%>&search=<%=keyword%>">[이후]</a>
			<%
			}
			%>
			</td>
		</tr>
		<tr>
			<td colspan="5" align="center">
				<form>
					<input type="hidden" name="limit" value="<%=limit%>">
					글쓴이 <input type="text" name="search">
					<input type="submit" value="검색">
				</form>
			</td>
		</tr>
	</table>
	
</body>
</html>















