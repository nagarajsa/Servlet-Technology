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
    <link rel="stylesheet" href="fetchAll.css">
  </head>
  <body>
   <h2>Students Data</h2>
    <a href="Home.html">Home</a>
     <br>
     <br>
      <%
        DataAccess access=new DataAccess();
        List<DataTransfer> list=access.FetchAll();
      %>
 
	  <table border="5" cellpadding="8px" cellspacing="5%" style="width:40%" >
	  <tr>
			<th bgcolor="lightblue" style="color:black">Id</th>
			<th bgcolor="lightblue" style="color:black">Name</th>
			<th bgcolor="lightblue" style="color:black">Middle_name</th>
			<th bgcolor="lightblue" style="color:black">Last_name</th>
			<th bgcolor="lightblue" style="color:black">Father_name</th>
			<th bgcolor="lightblue" style="color:black">Mother_name</th>
			<th bgcolor="lightblue" style="color:black">Email</th>
			<th bgcolor="lightblue" style="color:black">Passsword</th>
			<th bgcolor="lightblue" style="color:black">Mobile_No</th>
			<th bgcolor="lightblue" style="color:black">Gender</th>
			<th bgcolor="lightblue" style="color:black">Date_of_Birth</th>
			<th bgcolor="lightblue" style="color:black">Tenth_per</th>
			<th bgcolor="lightblue" style="color:black">Twelveth_Diploma_per</th>
			<th bgcolor="lightblue" style="color:black">Degree_per</th>
			<th bgcolor="lightblue" style="color:black">College_name</th>
			<th bgcolor="lightblue" style="color:black">Address</th>
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

		</tr>
		<%
		}
		%>
	</table>
</body>
</html>