package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.User_Data_Access;
import dto.User_Data;

@WebServlet("/Login")
public class Login extends HttpServlet
{
   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
   {
	  String emailphone=req.getParameter("emailphone");
	  String passwd=req.getParameter("passwd");
	  
	  User_Data_Access uda=new User_Data_Access();
	  
	  try 
	  {
		  long mobile=Long.parseLong(emailphone);
	   // resp.getWriter().print("<h1>You entered Phone Number</h1>");
		  User_Data user_Data=uda.Login(mobile);
		  if (user_Data==null) 
		  {
			  resp.getWriter().print("<h1>invallid Mobile Number</h1>");
			  req.getRequestDispatcher("Login.html").include(req, resp);
		  }
		  else
		  {
			  if(user_Data.getPassword().equals(passwd))
			  {
				  resp.getWriter().print("<h1>Login Successfull...!</h1>");
				  req.setAttribute("list", uda.fetchAll());
				  req.getRequestDispatcher("Home.jsp").include(req, resp);
			  }
			  else
			  {
				  resp.getWriter().print("<h1>Invallid Password</h1>");
				  req.getRequestDispatcher("Login.html").include(req, resp);
			  }
		 }
		  
	 }
	  
	  catch (NumberFormatException e) 
	  {
		  String email=emailphone;
	    //resp.getWriter().print("<h1>You entered Email</h1>");
		  User_Data user_Data=uda.Login(email);
		  if (user_Data==null) 
		  {
			  resp.getWriter().print("<h1>invallid Email</h1>");
			  req.getRequestDispatcher("Login.html").include(req, resp);
		  }
		  else
		  {
			  if(user_Data.getPassword().equals(passwd))
			  {
				  resp.getWriter().print("<h1>Login Successfull...!</h1>");
				  req.setAttribute("list", uda.fetchAll());
				  req.getRequestDispatcher("Home.jsp").include(req, resp);
			  }
			  else
			  {
				  resp.getWriter().print("<h1>Invallid Password</h1>");
				  req.getRequestDispatcher("Login.html").include(req, resp);
			  }
		  }
	  }
	  
	  
	  
   }
}
