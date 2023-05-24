<%@page import="dto.DataTransfer"%>
<%@page import="java.util.List"%>
<%@page import="dao.DataAccess"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
  <html>
   <head>
   <meta charset="ISO-8859-1">
   <title>Students Data</title>
   <link rel="stylesheet" href="update_delete.css">
   </head>
   <body>
   <h2>Update and Delete Students Data</h2>
   <a href="Home.html">Home</a>
   <br>
   <br>
   <%
     DataAccess access=new DataAccess();
     List<DataTransfer> list=access.FetchAll();
    %>

	 <table border="5" cellpadding="8px" cellspacing="5%" style="width:40%" >
		<tr>
			<th bgcolor="black" style="color:hotpink">Id</th>
			<th bgcolor="black" style="color:hotpink">Name</th>
			<th bgcolor="black" style="color:hotpink">Middle_name</th>
			<th bgcolor="black" style="color:hotpink">Last_name</th>
			<th bgcolor="black" style="color:hotpink">Father_name</th>
			<th bgcolor="black" style="color:hotpink">Mother_name</th>
			<th bgcolor="black" style="color:hotpink">Email</th>
			<th bgcolor="black" style="color:hotpink">Passsword</th>
			<th bgcolor="black" style="color:hotpink">Mobile_No</th>
			<th bgcolor="black" style="color:hotpink">Gender</th>
			<th bgcolor="black" style="color:hotpink">Date_of_Birth</th>
			<th bgcolor="black" style="color:hotpink">Tenth_per</th>
			<th bgcolor="black" style="color:hotpink">Twelveth_Diploma_per</th>
			<th bgcolor="black" style="color:hotpink">Degree_per</th>
			<th bgcolor="black" style="color:hotpink">College_name</th>
			<th bgcolor="black" style="color:hotpink">Address</th>
			<th bgcolor="black" style="color:hotpink">Edit</th>
			<th bgcolor="black" style="color:hotpink">Delete</th>
   	 </tr>

		<%
		for(DataTransfer dataTransfer:list)
		{
		%>
       <tr>
            <td><%=dataTransfer.getId()%></td>
			<td><%=dataTransfer.getName()%></td>
			<td><%=dataTransfer.getMiddle_name()%></td>
			<td><%=dataTransfer.getLast_name()%></td>
			<td><%=dataTransfer.getFather_name()%></td>
			<td><%=dataTransfer.getMother_name()%></td>
			<td><%=dataTransfer.getEmail()%></td>
			<td><%=dataTransfer.getPasssword()%></td>
			<td><%=dataTransfer.getMobile_No()%></td>
			<td><%=dataTransfer.getGender()%></td>
			<td><%=dataTransfer.getDate_of_Birth()%></td>
			<td><%=dataTransfer.getTenth_per()%></td>
			<td><%=dataTransfer.getTwelveth_Diploma_per()%></td>
			<td><%=dataTransfer.getDegree_per()%></td>
			<td><%=dataTransfer.getCollege_name()%></td>
			<td><%=dataTransfer.getAddress()%></td>
			<td>  <a href="edit.jsp?Id=<%=dataTransfer.getId()%>"> <button>Edit</button></a></td>
			<td>  <a href="delete?Id=<%=dataTransfer.getId()%>"> <button>Delete</button></a></td>
        </tr>
		<%
		}
		%>
	</table>
</body>
</html>