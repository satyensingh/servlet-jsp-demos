package com.training.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("1) This is ServletOne");
		PrintWriter out = response.getWriter();
		out.print("<h1>This is ServletOne</h1>");
		
		request.getRequestDispatcher("ServletTwo").include(request, response);
		
		System.out.println("2) This is ServletOne");
		out.print("<h1>This is ServletOne</h1>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}