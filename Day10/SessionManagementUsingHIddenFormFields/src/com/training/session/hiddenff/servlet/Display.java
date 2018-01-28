package com.training.session.hiddenff.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Display extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String vehicle = request.getParameter("vehicle");
		String car = request.getParameter("car");
		String manufacturer = request.getParameter("manufacturer");
		String model = request.getParameter("model");
		
		out.println("Vehicle : "+vehicle+"</br>");
		out.println("Car Type : "+car+"</br>");
		out.println("Manufacturer : "+manufacturer+"</br>");
		out.println("Model : "+model+"</br>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
