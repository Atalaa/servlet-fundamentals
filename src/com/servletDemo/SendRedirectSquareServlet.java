package com.servletDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SendRedirectSquareServlet extends HttpServlet {
	private static final long serialVersionUID = 3L;
       
   
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//fetching data
		HttpSession session = request.getSession(); //create a new session
		int res = (int) session.getAttribute("res");

		//get the printWriter (that I'll use for sending back the data)
		PrintWriter out = response.getWriter();
				
		//generate HTML content on the fly
		out.println("Square result of " + res + " is " + res*res);
		
	}
}
