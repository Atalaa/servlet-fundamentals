package com.servletDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SquareServlet extends HttpServlet {
	private static final long serialVersionUID = 3L;
       
   
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int res = (int) request.getAttribute("res");

		PrintWriter out = response.getWriter();
				
		out.println("Square result of " + res + " is " + res*res);
		
	}
}
