package com.training.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReadingRequestHeader extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		/*
		String browserInfo = request.getHeader("User-Agent");
		out.print("Browser Details: <br/>"+browserInfo+"<br/><br/><br/>");
		if(browserInfo.contains("Chrome")) {
			out.print("You are using Chrome");
		} else if(browserInfo.contains("Firefox")) {
			out.print("You are using Firefox");
		} else if (browserInfo.contains("Safari") && !browserInfo.contains("Chrome")) {
			out.print("You are using Safari");
		}*/
		
		
		PrintWriter out = response.getWriter();
		Enumeration<String> enumHeaderNames = request.getHeaderNames();
		while(enumHeaderNames.hasMoreElements()) {
			String headerName = enumHeaderNames.nextElement();
			String headerValue = request.getHeader(headerName);
			out.print(headerName+" = "+headerValue+"<br/>");
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
