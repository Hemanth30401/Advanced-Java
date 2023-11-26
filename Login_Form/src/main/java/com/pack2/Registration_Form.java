package com.pack2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Reg")
public class Registration_Form extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fullname = request.getParameter("fullName");
		String rollNumber = request.getParameter("rollNumber");
		String email = request.getParameter("emailId");
		String password = request.getParameter("password");
		R_Dto dto = new R_Dto(fullname,rollNumber,email,password);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try {
			int rows = R_Dao.getData(fullname,rollNumber,email,password);
			if(rows>0)
			{
				RequestDispatcher rd = request.getRequestDispatcher("Login.html");
				rd.forward(request, response);
			}
			else {
				out.println("Please Try Again");
				RequestDispatcher rd = request.getRequestDispatcher("Register.html");
				rd.include(request, response);
			}
		} 
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
