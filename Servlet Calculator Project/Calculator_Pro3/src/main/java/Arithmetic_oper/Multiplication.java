package Arithmetic_oper;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet implementation class Multiplication
 */
public class Multiplication extends GenericServlet 
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		 int num1=Integer.parseInt(request.getParameter("n1"));
	     int num2=Integer.parseInt(request.getParameter("n2"));
	     
	     response.getWriter().println("<h1 style='color:green;'>**********RESULT*********</h1>");
	     response.getWriter().print("<h1>The Multiplication of " +num1+ " "+"and"+" "+num2+" "+ "is:" +(num1*num2)+"</h1>");
	}

}
