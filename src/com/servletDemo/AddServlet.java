package com.servletDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(
		name="AnnotatedServlet",
		description="a sample annoted servlet",
		urlPatterns={"/AddServlet"}
)

public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AddServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//step 1: set the content type
		String n1 = request.getParameter("numberOne");
		String n2 = request.getParameter("numberTwo");
		response.setContentType("text/html");
		
		//step 2: get the printWriter (that I'll use for sending back the data)
		PrintWriter printWriter = response.getWriter();
		
		//step 3: generate HTML content on the fly//		
		int res1 = Integer.parseInt(n1);
		int res2 = Integer.parseInt(n2);
		printWriter.print(res1 + res2);
			
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
