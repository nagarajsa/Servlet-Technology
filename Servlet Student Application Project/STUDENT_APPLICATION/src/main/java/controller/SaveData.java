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

@WebServlet("/insert") // url for html file to java and logics
public class SaveData extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// getting user data
		String name = req.getParameter("name");
		String mname = req.getParameter("mname");
		String lname = req.getParameter("lname");
		String fname = req.getParameter("fname");
		String moname = req.getParameter("moname");
		String email = req.getParameter("email");
		String passwd = req.getParameter("passwd");
		long mobile = Long.parseLong(req.getParameter("mobile"));
		String gender = req.getParameter("gender");
		Date dob = Date.valueOf(req.getParameter("dob"));
		double tenth = Double.parseDouble(req.getParameter("tenth"));
		double tw_dip = Double.parseDouble(req.getParameter("tw_dip"));
		double degree = Double.parseDouble(req.getParameter("degree"));
		String college = req.getParameter("college");
		String address = req.getParameter("address");

		// setting user data
		DataTransfer dataTransfer = new DataTransfer();
		dataTransfer.setName(name);
		dataTransfer.setMiddle_name(mname);
		dataTransfer.setLast_name(lname);
		dataTransfer.setFather_name(fname);
		dataTransfer.setMother_name(moname);
		dataTransfer.setEmail(email);
		dataTransfer.setPasssword(passwd);
		dataTransfer.setMobile_No(mobile);
		dataTransfer.setGender(gender);
		dataTransfer.setDate_of_Birth(dob);
		dataTransfer.setTenth_per(tenth);
		dataTransfer.setTwelveth_Diploma_per(tw_dip);
		dataTransfer.setDegree_per(degree);
		dataTransfer.setCollege_name(college);
		dataTransfer.setAddress(address);

		DataAccess access = new DataAccess();
		access.save(dataTransfer);

		resp.getWriter().print(
				"<html><head><title> Sucess </title> </head> <body> <h1 style='color:green;'>Student Added Sucessfuly..!</h1> </body> </html>");

	}
}
