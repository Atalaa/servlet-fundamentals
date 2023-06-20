package com.servletDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyServletContextAndConfig extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.print("Hi ");
		
		//Print value of name or phone in web.xml
//		ServletContext ctx = getServletContext();
//		String str = ctx.getInitParameter("name");
		
		ServletConfig config = getServletConfig();
		String str = config.getInitParameter("name");
		
		out.println(str);
		
	}

}
