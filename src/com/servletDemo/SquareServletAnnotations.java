package com.servletDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/addNumber/calculateSquare")
public class SquareServletAnnotations extends HttpServlet {
	private static final long serialVersionUID = 3L;
       
   
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//fetching data
		int res = (int) request.getAttribute("res");

		//get the printWriter (that I'll use for sending back the data)
		PrintWriter out = response.getWriter();
				
		//generate HTML content on the fly
		out.println("Annotation Square result of " + res + " is " + res*res);
		
	}
}
