package com.training.session.hiddenff.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ChooseManufacturer extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		// Create a session if the sessionid is not in the request header
		// else pick-up the session object having sessionid same as in request header
		HttpSession httpSession = request.getSession();

		// set the data in session object
		httpSession.setAttribute("car", request.getParameter("car"));

		String modelURL = response.encodeURL("model");
		
		PrintWriter out = response.getWriter();
		out.print("<form action='"+modelURL+"'>" + "Choose Manufacturer : <select name='manufacturer'>"
				+ "<option value='Honda'>Honda</option>" + "<option value='Chevrolet'>Chevrolet</option>"
				+ "<option value='BMW'>BMW</option>" + "<option value='Volkswagen'>Volkswagen</option>" + "</select>"
				+ "<input type='hidden' name='vehicle' value='" + request.getParameter("vehicle") + "'>"
				+ "<input type='hidden' name='car' value='" + request.getParameter("car") + "'>" + "<br/>"
				+ "<input type='submit' value='Save'/>" + "</form>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
