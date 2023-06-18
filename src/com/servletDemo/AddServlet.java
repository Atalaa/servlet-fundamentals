package com.servletDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;


public class AddServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//step 1: set the content type
		int n1 = Integer.parseInt(request.getParameter("num1"));
		int n2 = Integer.parseInt(request.getParameter("num2"));
		int res = n1 + n2;
		response.setContentType("text/html");
		
		//step 2: get the printWriter (that I'll use for sending back the data)
		PrintWriter out = response.getWriter();
		
		//step 3: generate HTML content on the fly//		
		out.print("result is " + res);
		
		//session management (share Data between servlet)
		request.setAttribute("res", res);
		
		
		//RequestDispatcher to dispatch a request from one servlet to another servlet
		RequestDispatcher rd = request.getRequestDispatcher("calculateSquare");
		rd.forward(request, response);
	}
}
