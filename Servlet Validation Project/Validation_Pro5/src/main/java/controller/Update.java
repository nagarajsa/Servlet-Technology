package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.User_Data_Access;
import dto.User_Data;

@WebServlet("/update")
public class Update extends HttpServlet
{
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
  {
	 User_Data user_Data=new User_Data();
     user_Data.setFirst_name(req.getParameter("fname"));
     user_Data.setEmail(req.getParameter("email"));
     user_Data.setMobile_No(Long.parseLong(req.getParameter("mobile")) );
     user_Data.setPassword(req.getParameter("passwd"));
	 
     User_Data_Access uda=new User_Data_Access();
                      uda.update(user_Data);
                      
        resp.getWriter().print("<h1> Data Updated Successfully..!</h1>");
        req.setAttribute("list", uda.fetchAll());
	    req.getRequestDispatcher("Home.jsp").include(req, resp);
  }
}
