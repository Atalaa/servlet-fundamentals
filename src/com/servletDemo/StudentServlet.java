package com.servletDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class StudentServlet extends HttpServlet {
	
	private static final long serialVersionUID = 2L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//step 1: set the content type
		String fName = request.getParameter("fName");
		String lName = request.getParameter("lName");
		response.setContentType("text/html");
		
		//step 2: get the printWriter (that I'll use for sending back the data)
		PrintWriter out = response.getWriter();
		
		//step 3: generate HTML content on the fly//		
		out.print(fName + " " + lName);
	}
}
