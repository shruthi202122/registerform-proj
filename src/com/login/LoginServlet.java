package com.login;

import java.io.*;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		PrintWriter out=response.getWriter();
		System.out.println("username="+uname);
		System.out.println("password="+pwd);
		
		if(uname==null || pwd==null || uname.trim()==""||pwd.trim()=="") {
			request.setAttribute("err-msg","Please enter valid details");
			request.getRequestDispatcher("error.jsp").include(request,response);
		}
		else {
			Userdb ub=new Userdb();
			List<User> l=ub.getUserDetails(uname,pwd);
		
			if(l!=null){
				HttpSession session=request.getSession(true);
				session.setAttribute("uname",uname);
				//request.setAttribute("suc-msg","You are logged in successfully");
				request.getRequestDispatcher("home.jsp").include(request,response);
			}
			else {
				request.setAttribute("err-msg","Enter username/password currectley");
				request.getRequestDispatcher("error.jsp").include(request,response);
			}
		}
	}

}
