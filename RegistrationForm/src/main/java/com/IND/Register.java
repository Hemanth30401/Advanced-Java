package com.IND;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet 
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fullname = request.getParameter("fullName");
		String rollNumber = request.getParameter("rollNumber");
		String email = request.getParameter("emailId");
		String mobileNumber = request.getParameter("mobileNumber");
		Dto dto = new Dto(fullname,rollNumber,email,mobileNumber);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try {
			int rows = Dao.getData(fullname,rollNumber,email,mobileNumber);
			if(rows>0)
				out.println("Thank you for your registration");
			else
				out.println("Please Try Again");
		} 
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
