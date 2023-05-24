<%@page import="dto.DataTransfer"%>
<%@page import="dao.DataAccess"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
  <html>
  <head>
    <meta charset="ISO-8859-1">
    <title>Add Students</title>
    <link rel="stylesheet" href="addstudent.css">
    </head>
    <body>

       <%
         int Id=Integer.parseInt(request.getParameter("Id"));
         DataAccess access=new DataAccess();
         DataTransfer dataTransfer=access.Fetchid(Id);
       %>

	 <h2> Students Data</h2>
	  <div align="center">
		<h3>Update Student Data</h3>
		<div class="container">
		<form action="update" method="post">
			<table>
				<tr>
				   <th>
					 <label>Enter Your Name:</label>
					 <input type="text" name="name" value="<%=dataTransfer.getName()%>" placeholder="Your Name" required="required"> <br> <br>
				
				     <label>Enter Your Middle Name:</label>
					 <input type="text"  name="mname"  value="<%=dataTransfer.getMiddle_name()%>" placeholder="Your Middle Name" required="required"> <br> <br>
					 
					  <label>Enter Your Last Name:</label>
					  <input type="text" name="lname" value="<%=dataTransfer.getLast_name()%>" placeholder="Your Last Name" required="required"> <br> <br>
					  
					  <label>Enter Your Father Name:</label>
					  <input type="text" name="fname"  value="<%=dataTransfer.getFather_name()%>" placeholder="Your Father Name" required="required"> <br> <br>
					  
					  <label>Enter Your Mother Name:</label>
					  <input type="text" name="moname"  value="<%=dataTransfer.getMother_name()%>" placeholder="Your Mother Name" required="required"><br> <br>
					  
					  <label>Enter Your Email:</label>
					  <input type="email" name="email" value="<%=dataTransfer.getEmail()%>" placeholder="Your Email" required="required"> <br> <br>
					 
					  <label>Enter Your Password:</label>
					  <input type="password" name="passwd"  value="<%=dataTransfer.getPasssword()%>" placeholder="Your Password" required="required"> <br> <br>
					 
					  <label>Enter Your Mobile Number:</label>
					  <input type="number" name="mobile" value="<%=dataTransfer.getMobile_No()%>" placeholder="Your Mobile Number" required="required"> <br> <br>
			         
			         <label>Select Your Gender:</label> &nbsp; &nbsp;
					  Male<input type="radio" name="gender" value="<%=dataTransfer.getGender()%>" value="male">
					  Female<input type="radio" name="gender" value="<%=dataTransfer.getGender()%>" value="female">
					  Others<input type="radio" name="gender" value="<%=dataTransfer.getGender()%>" value="others">
					   <br> <br>
				
			         <label>Enter Your Date of Birth:</label>
					 <input type="date" name="dob" value="<%=dataTransfer.getDate_of_Birth()%>" required="required"> <br> <br>
				
				     <label>Enter Your 10th Percentage:</label>
					 <input type="number" name="tenth" value="<%=dataTransfer.getTenth_per()%>" placeholder="SSLC Percentage" required="required"> <br> <br>
					 
					 <label>Enter Your 12th or Diploma Percentge:</label>
					 <input type="number" name="tw_dip"  value="<%=dataTransfer.getTwelveth_Diploma_per()%>" placeholder="12th or Diploma Percentge" required="required"> <br> <br>
					 
					 <label>Enter Your Degree Percentage:</label>
					 <input type="number" name="degree" value="<%=dataTransfer.getDegree_per()%>" placeholder="Degree Percentage" required="required"> <br> <br>
			
				     <label> Choose your College:</label> &nbsp; &nbsp;
				     <select name="college" value="<%=dataTransfer.getCollege_name()%>" style="width:50%" required="required">
							<option>Select Your College</option>
							<option>Bapuji Institute of Engineering and Technology, Davanagere.</option>
							<option>Basaveshwara Institute of Engineering and Technology, Bagalakot.</option>
							<option>Gogte Institute of Engineering and Technology, Belagavi.</option>
							<option>Bhoomreddy Institute of Engineering and Technology, Hubbli.</option>
							<option>Angadi Institute of Engineering and Technology, Belagavi.</option>
							<option>Jain Institute of Engineering and Technology, Davanagere.</option>
							<option>Nagarjuna Institute of Engineering and Technology, Bangalore.</option>
							<option>Reva Institute of Engineering and Technology, Bangalore.</option>
							<option>M S Ramaiha Institute of Engineering and Technology, Bangalore.</option>
							<option>UBD Institute of Engineering and Technology, Davanagere.</option>
							<option>Siddaganga Institute of Engineering and Technology, Tumkur.</option>
							<option>Siddharth Institute of Engineering and Technology, Tumkur.</option>
							<option>JSS Institute of Engineering and Technology, Mysore.</option>
							<option>Manipal Institute of Engineering and Technology, Manipal.</option>
							<option>PES Institute of Engineering and Technology, Mandya.</option>
							<option>Dr.Ambedkar Institute of Engineering and Technology, Bangalore.</option>
							<option>Other</option>
					</select>
				   <br> <br>
				
				<label>Address:</label>
                <textarea rows="10" cols="40" name="address"   value="<%=dataTransfer.getAddress()%>"placeholder="Enter your address here"> </textarea>
                <br> <br>
                
				<button type="reset">Cancel</button> &nbsp; &nbsp;
				<button type="submit">Update</button>
				</th>
				</tr>
			</table>
		</form>		
	</div>
  </div>
  <a href="Home.html">Home</a>
</body>
</html>