package controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import dao.DataAccess;
import dto.DataTransfer;

@WebServlet("/fetchid")
public class FetchId extends GenericServlet {
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {

		int Id=Integer.parseInt(req.getParameter("Id"));
		DataAccess access=new DataAccess();
		DataTransfer dataTransfer =access.Fetchid(Id);
		
		if(dataTransfer==null)
		{
			resp.getWriter().print("<h1 style='color:red'> Student Data Not Found</h1>");
		}
		else {
		
		resp.getWriter().print("<html> <head> <title> Students data </title> <body> <table border=5>");
		resp.getWriter().print("<tr>"
				+ "<th> Id </th>"
				+ "<th> Name </th>"
				+ "<th> Middle_name </th>"
				+ "<th> Last_name </th>"
				+ "<th> Father_name </th>"
				+ "<th> Mother_name </th>"
				+ "<th> Email </th>"
				+ "<th> Passsword </th>"
				+ "<th> Mobile_No </th>"
				+ "<th> Gender </th>"
				+ "<th> Date_of_Birth </th>"
				+ "<th> Tenth_per </th>"
				+ "<th> Twelveth_Diploma_per </th>"
				+ "<th> Degree_per </th>"
				+ "<th> College_name </th>"
				+ "<th> Address </th>"
				+ "</tr>");
		
		//getting the student data
		
			resp.getWriter().print("<tr style=width:100%>"
					+ "<th>"+ dataTransfer.getId()+ "</th>"
				    + "<th>"+ dataTransfer.getName()+ "</th>"
					+ "<th>"+ dataTransfer.getMiddle_name()+ "</th>"
					+ "<th>"+ dataTransfer.getLast_name()+ "</th>"
					+ "<th>"+ dataTransfer.getFather_name()+ "</th>"
					+ "<th>"+ dataTransfer.getMother_name()+ "</th>"
					+ "<th>"+ dataTransfer.getEmail()+ "</th>"
					+ "<th>"+ dataTransfer.getPasssword()+ "</th>"
					+ "<th>"+ dataTransfer.getMobile_No()+ "</th>"
					+ "<th>"+ dataTransfer.getGender()+ "</th>"
					+ "<th>"+ dataTransfer.getDate_of_Birth()+ "</th>"
					+ "<th>"+ dataTransfer.getTenth_per()+ "</th>"
					+ "<th>"+ dataTransfer.getTwelveth_Diploma_per()+ "</th>"
					+ "<th>"+ dataTransfer.getDegree_per()+ "</th>"
					+ "<th>"+ dataTransfer.getCollege_name()+ "</th>"
					+ "<th>"+ dataTransfer.getAddress()+ "</th>"
					+ "</tr>");
		
	    resp.getWriter().print("</table> </body> </html>");
	
	   }
		
	  }
	}


