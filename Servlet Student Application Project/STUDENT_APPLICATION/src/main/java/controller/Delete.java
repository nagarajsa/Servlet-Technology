package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DataAccess;
import dto.DataTransfer;

@WebServlet("/delete")
public class Delete extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int Id = Integer.parseInt(req.getParameter("Id"));

		DataAccess access = new DataAccess();
		DataTransfer dataTransfer = access.Fetchid(Id);
		access.delete(dataTransfer);

		resp.getWriter().print("<h1 style='color:white;'> Data Deleted Successfully..!</h1>");
		req.setAttribute("list", access.FetchAll());
		req.getRequestDispatcher("fetchAll.jsp").include(req, resp);
	}
}
