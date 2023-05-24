<%@page import="dto.User_Data"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Jsp</title>
</head>
<body>


	<%
	  List<User_Data> list=(List<User_Data>)request.getAttribute("list");
	%>
	
	
   <table border="1">
	<tr>
	 <th> mobile_No  </th>
	 <th> first_name  </th>
	 <th> email </th>
	 <th> password  </th>
	 <th> Edit &nbsp; </th>
	 <th> Delete &nbsp;</th>
	</tr>
	
	
	<%
	  for(User_Data data:list)
	  {
	%>
	<tr>
	 <td> <%=data.getMobile_No() %></td>
	 <td> <%=data.getFirst_name() %></td>
	 <td> <%=data.getEmail() %></td>
	 <td> <%=data.getPassword() %></td>
	 <td> <a href="edit.jsp?mobile=<%=data.getMobile_No()%>"><button>Edit</button></a> </td>
	 <td> <a href="delete?mobile=<%=data.getMobile_No()%>"><button>Delete</button></a> </td>
	</tr>
	
	<%
	 }
	%>
	</table>

</body>
</html>