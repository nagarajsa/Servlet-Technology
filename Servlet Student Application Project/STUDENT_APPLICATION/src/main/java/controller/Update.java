package controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DataAccess;
import dto.DataTransfer;

@WebServlet("/update")
public class Update extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		DataTransfer dataTransfer = new DataTransfer();
		dataTransfer.setName(req.getParameter("name"));
		dataTransfer.setMiddle_name(req.getParameter("mname"));
		dataTransfer.setLast_name(req.getParameter("lname"));
		dataTransfer.setFather_name(req.getParameter("fname"));
		dataTransfer.setMother_name(req.getParameter("moname"));
		dataTransfer.setEmail(req.getParameter("email"));
		dataTransfer.setPasssword(req.getParameter("passwd"));
		dataTransfer.setMobile_No(Long.parseLong(req.getParameter("mobile")));
		dataTransfer.setGender(req.getParameter("gender"));
		dataTransfer.setDate_of_Birth(Date.valueOf(req.getParameter("dob")));
		dataTransfer.setTenth_per(Double.parseDouble(req.getParameter("tenth")));
		dataTransfer.setTwelveth_Diploma_per(Double.parseDouble(req.getParameter("tw_dip")));
		dataTransfer.setDegree_per(Double.parseDouble(req.getParameter("degree")));
		dataTransfer.setCollege_name(req.getParameter("college"));
		dataTransfer.setAddress(req.getParameter("address"));

		DataAccess access = new DataAccess();
		access.update(dataTransfer);

		resp.getWriter().print("<h1 style='color:green;'> Data Updated Successfully..!</h1>");
		req.setAttribute("list", access.FetchAll());
		req.getRequestDispatcher("update_delete.jsp").include(req, resp);

	}

}
