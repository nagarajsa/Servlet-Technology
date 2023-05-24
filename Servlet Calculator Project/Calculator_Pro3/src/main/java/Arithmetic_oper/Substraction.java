package Arithmetic_oper;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Substraction implements Servlet
{

	public static void main(String[] args) 
	{
		

	}

	public void destroy() 
	{
		// TODO Auto-generated method stub
		
	}

	public ServletConfig getServletConfig() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	public String getServletInfo() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	public void init(ServletConfig config) throws ServletException 
	{
		// TODO Auto-generated method stub
		
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
	     int num1=Integer.parseInt(req.getParameter("n1"));
	     int num2=Integer.parseInt(req.getParameter("n2"));
	     
	     res.getWriter().println("<h1 style='color:green;'>**********RESULT*********</h1>");
	     res.getWriter().print("<h1>The Substraction of " +num1+ " "+"and"+" "+num2+" "+ "is:" +(num1-num2)+"</h1>");
		
	}

}
