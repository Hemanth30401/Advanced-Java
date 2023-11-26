package com.pack1;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Log")
public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		L_Dto dto = new L_Dto();
		String emailId = req.getParameter("emailId");
		dto.setEmailId(emailId);
		String password = req.getParameter("password");
		dto.setPassword(password);
		try {
			ResultSet rs = L_Dao.getData(dto);
			if(rs.next())
			{
				RequestDispatcher rd = req.getRequestDispatcher("Home.html");
				rd.forward(req, res);
			}
			else
			{
				RequestDispatcher rd = req.getRequestDispatcher("Login.html");
				rd.include(req, res);
			}
		} catch (ClassNotFoundException | SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
