package com.training.session.hiddenff.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ChooseCarServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		//Create a session if the sessionid is not in the request header
		//else pick-up the session object having sessionid same as in request header
		HttpSession httpSession = request.getSession();
		
		//set the data in session object
		httpSession.setAttribute("vehicle", request.getParameter("vehicle"));
		
		
		
		PrintWriter out = response.getWriter();
		out.print("<form action='manufacturer'>"
				+ "Choose Car Type : <select name='car'>"
				+ "<option value='Sedan'>Sedanr</option>"
				+ "<option value='Hatchback'>Hatchback</option>"
				+ "<option value='SUV'>SUV</option>"
				+ "</select>"
				+ "<br/>"
				+ "<input type='submit' value='Save'/>"
				+ "</form>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
