package Dynamic_res;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.xml.transform.stax.StAXSource;

public class Demo implements Servlet
{

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

	public void init(ServletConfig arg0) throws ServletException 
	{
		// TODO Auto-generated method stub
		
	}

	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException 
	{
		 
		 System.out.println("login Successfull...!");
		 String fname=arg0.getParameter("firstname");
		 String pwd=arg0.getParameter("passwd");
		 System.out.println("The Username is: " +fname);
		 System.out.println("The Password is: " +pwd);
		 
		arg1.getWriter().print("<h1 style='color:green;'>Login Successfull...!</h1>");
		arg1.getWriter().print("---------------------------------------------------");
		arg1.getWriter().println("<h3>The Username is: " +fname+"</h3>");
		arg1.getWriter().println("<h3>The Password is: " +pwd+"</h3>");
		arg1.getWriter().println("<h4 style='color:red;'>Thank you...!</h4>");
		
	}

}
