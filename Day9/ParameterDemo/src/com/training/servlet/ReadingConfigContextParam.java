package com.training.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReadingConfigContextParam extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String interestRate = getServletConfig().getInitParameter("interestRate");
		String organization = getServletContext().getInitParameter("organization");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>Interest Rate : "+interestRate+"</h1>");
		out.print("<h1>Organization : "+organization+"</h1>");
		out.print("<h1>Driver Name : "+getServletContext().getAttribute("driverName")+"</h1>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}