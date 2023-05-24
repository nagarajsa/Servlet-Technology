package controller;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.User_Data_Access;
import dto.User_Data;

@WebServlet("/forward")
public class SignUp extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
	    User_Data user_Data=new User_Data();
        user_Data.setFirst_name(req.getParameter("fname"));
        user_Data.setEmail(req.getParameter("email"));
        user_Data.setMobile_No(Long.parseLong(req.getParameter("mobile")) );
        user_Data.setPassword(req.getParameter("passwd"));
        
        //res.getWriter().print("<h1>"+user_Data+"</h1>");
        
        User_Data_Access uda=new User_Data_Access();
                         uda.forward(user_Data);
         resp.setContentType("text/html");
         resp.getWriter().print("<h1>Account has been created successfully..!</h1>");
         req.getRequestDispatcher("Login.html").include(req, resp);

	}

}
