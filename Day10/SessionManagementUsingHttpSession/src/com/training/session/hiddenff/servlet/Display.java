package com.training.session.hiddenff.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Display extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		// Create a session if the sessionid is not in the request header
		// else pick-up the session object having sessionid same as in request header
		HttpSession httpSession = request.getSession();

		String vehicle = (String) httpSession.getAttribute("vehicle");
		String car = (String) httpSession.getAttribute("car");
		String manufacturer = (String) httpSession.getAttribute("manufacturer");
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
