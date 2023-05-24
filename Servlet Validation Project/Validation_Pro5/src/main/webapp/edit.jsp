<%@page import="dto.User_Data"%>
<%@page import="dao.User_Data_Access"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit</title>
</head>
<body>

<%
   long mobile=Long.parseLong(request.getParameter("mobile"));
   User_Data_Access uda=new User_Data_Access();
   User_Data user_Data =uda.find(mobile);
%>

<form action="update" method="post">
		<table border=6 cellpadding=50 style="background-color: lightblue">
			<tr>
				<th>
				<h1>SignUp</h1>
				<hr color="red">
				<label>Enter First name :
				<input type="text" name="fname" value="<%=user_Data.getFirst_name() %>" placeholder="Enter First name :" required="/">
				</label>
				<br> <br>
				<label>Enter Email-Id :
				<input type="email" name="email" value="<%=user_Data.getEmail() %>" placeholder="Enter Email-Id :" required="/">
				</label>
				<br> <br>
				<label>Enter Mobile No :
				<input type="text" name="mobile" value="<%=user_Data.getMobile_No() %>" placeholder="Enter Mobile No :" required="/" readonly="readonly">
				</label>
				<br> <br>
				<label>Enter Password :
				<input type="password" name="passwd" value="<%=user_Data.getPassword() %>" placeholder="Enter Password :" required="/">
				</label>
				<br> <br>
				<button type="reset">Cancel</button> <br> <br> 
				<button type="Submit">Update</button>
				
				<br> <br>
				<a href="Login.html"><i>already have an account? <br> please Login here</i></a>
				
			    </th>
			</tr>

		</table>


	</form>
</body>
</html>