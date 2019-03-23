package com.login;

import java.io.*;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class AuthenticationFilter
 */
public class AuthenticationFilter implements Filter {

    /**
     * Default constructor. 
     */
    public AuthenticationFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.setContentType("text/html");
		HttpServletRequest req=(HttpServletRequest)request;
		HttpServletResponse res=(HttpServletResponse)response;
		HttpSession session=req.getSession(false);
		PrintWriter out=res.getWriter();
	
		System.out.println("session:"+session);
	
		String uri=req.getRequestURI();
		System.out.println(uri);
		String context=req.getContextPath();
		System.out.println(context);
		
	
		if(session!=null && session.getAttribute("uname")!=null) {
			chain.doFilter(request,response);
			System.out.println("Success-1");
		}
		else {
			if(req.getRequestURI().endsWith(context+"/") || req.getRequestURI().endsWith("login.jsp")|| req.getRequestURI().endsWith("Login")||req.getRequestURI().endsWith("register.jsp")||req.getRequestURI().endsWith("Register")) {
				
				System.out.println("success2");
				chain.doFilter(req,res);
			}
			else{
				System.out.println("error");
				req.setAttribute("err-msg","Please login first");
				
				req.getRequestDispatcher("/error.jsp").include(req,res);
				
			}
		}
	}
		
	

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
