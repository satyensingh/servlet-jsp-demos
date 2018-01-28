package com.training.session.hiddenff.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ChooseVehicleServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<form action='car'>"
				+ "Choose Vehicle : <select name='vehicle'>"
				+ "<option value='Car'>Car</option>"
				+ "<option value='Bike'>Bike</option>"
				+ "<option value='Cycle'>Cycle</option>"
				+ "</select>"
				+ "<br/>"
				+ "<input type='submit' value='Save'/>"
				+ "</form>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
