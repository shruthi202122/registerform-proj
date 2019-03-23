package com.login;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		if(request.getSession(false)!=null) {
			HttpSession session=request.getSession(false);
			session.invalidate();
			out.println("<head><style>p{color:red}</style><head>");
			out.println("<body style='background-color:violet'><p>you are logged out successfully<p>");
			out.println("<a href='login.jsp'>login again</a>");
			
		}
		else {
			out.println("Something went wrong");
		}
		
		
		
	}
}