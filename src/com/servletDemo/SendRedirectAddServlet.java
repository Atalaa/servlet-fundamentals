package com.servletDemo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SendRedirectAddServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//set the content type
		int n1 = Integer.parseInt(request.getParameter("num1"));
		int n2 = Integer.parseInt(request.getParameter("num2"));
		int res = n1 + n2;
		response.setContentType("text/html");
		
		//session management (share Data between servlet)
		HttpSession session = request.getSession(); //create a new session
		session.setAttribute("res", res);
		
		//sendRedirect to redirect a NEW request from one servlet to another servlet
		response.sendRedirect("calculateSquareRedirect");
	}
}
