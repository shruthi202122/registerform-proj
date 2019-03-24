package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uname1 = request.getParameter("uname");
		String pwd1 = request.getParameter("pwd");
		String pwd2 = request.getParameter("pwd1");
		String gender = request.getParameter("gender");
		String age = request.getParameter("age");
		String mobile = request.getParameter("no");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		Connection con = null;
		System.out.println("User name= " + uname1);
		System.out.println("password= " + pwd1);

		Userdb2 ub = new Userdb2();
		int result = ub.getUserDetails(uname1);
		if (result != 0) {
			request.setAttribute("err-msg",
					"<p  style='color:red'>User already existed in db ..Try with another name</p>");
			request.getRequestDispatcher("register.jsp").forward(request, response);
			return;
		}
		if (uname1 != null && pwd1 != null && gender != null && age != null && mobile != null && uname1.trim() != ""
				&& pwd1.trim() != "" && gender.trim() != "" && age.trim() != "" && mobile.trim() != "" && result == 0) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost/shruthidb", "shruthi", "abc");
				PreparedStatement ps = con.prepareStatement("insert into emp values(?,?,?,?,?)");
				ps.setString(1, uname1);
				ps.setString(2, pwd1);
				ps.setString(3, age);
				ps.setString(4, gender);
				ps.setString(5, mobile); 
				int i = ps.executeUpdate();
				if (i > 0) {
					System.out.println("inserted successfully");
					request.setAttribute("success-msg",
							"<p style='color:green'>Registered Successfully,you can login now..</p>");
					request.getRequestDispatcher("success.jsp").forward(request, response);
					
				}

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (con != null) {
					try {
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}

			}

		} else {
			request.setAttribute("err-msg", "<p style='color:red;'>Fill the details currectly<p>");
			request.getRequestDispatcher("register.jsp").include(request, response);
			return;
		}

	}

}
