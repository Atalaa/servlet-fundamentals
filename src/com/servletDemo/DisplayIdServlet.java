package com.servletDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DisplayIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//fetching data
		String nickName = (String) request.getAttribute("nickName");
		String age = (String) request.getAttribute("age");
		String streetNb = (String) request.getAttribute("streetNb");
		String StreetName = (String) request.getAttribute("streetName");
		String city = (String) request.getAttribute("city");
		
		//get the printWriter (that I'll use for sending back the data)
		PrintWriter out = response.getWriter();
		
		//generate HTML content on the fly
		out.println("Hello Mister " + nickName + ".<br/>");
		out.println("You are " + age + " years old.<br/>");
		out.println("You are living at " + streetNb + " " +
		StreetName + " in " + city + " city." );
	}

}
