package com.servletDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class IdentityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
   		//set the content type
   		String nickName = request.getParameter("nickName");
   		String age = request.getParameter("age");
   		String streetNb = request.getParameter("streetNb");
   		String streetName = request.getParameter("streetName");
   		String city = request.getParameter("city");
   		response.setContentType("text/html");
   		
   		//session management (share Data between servlet)
   		request.setAttribute("nickName", nickName);
   		request.setAttribute("age", age);
   		request.setAttribute("streetNb", streetNb);
   		request.setAttribute("streetName", streetName);
   		request.setAttribute("city", city);
   		
   		//RequestDispatcher to dispatch a request from one servlet to another servlet
   		RequestDispatcher rd = request.getRequestDispatcher("displayIdentity");
   		rd.forward(request, response);
	}

}
