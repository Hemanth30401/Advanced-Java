package One;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Product3 extends HttpServlet
{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String fullName = req.getParameter("fullName");
		String lastName = req.getParameter("lastName");
		String mobile= req.getParameter("mobile");
		String gender=req.getParameter("gender");
		String email=req.getParameter("email");
		res.setContentType("text/html");
		PrintWriter out= res.getWriter();
		out.println("Hello"+"<br>");
		out.println(fullName+"<br>");
		out.println(lastName + "<br>");
		out.println(mobile + "<br>");
		out.println(gender + "<br>");
		out.println(email + "<br>");
		
	}
	
}
