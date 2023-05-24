package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;

import dao.User_Data_Access;
import dto.User_Data;

@WebServlet("/delete")
public class Delete extends HttpServlet
{
  @Override
protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException 
  {
	   long mobile = Long.parseLong(arg0.getParameter("mobile"));
	   
	   User_Data_Access uda=new User_Data_Access();
	   
	   User_Data user_Data=uda.find(mobile);
	   
	   uda.delete(user_Data);
	   
	   
	   arg1.getWriter().print("<h1> Data deleted Successfully...!</h1>");
	   
	   arg0.setAttribute("list", uda.fetchAll());
	   arg0.getRequestDispatcher("Home.jsp").include(arg0, arg1);
  }
}
