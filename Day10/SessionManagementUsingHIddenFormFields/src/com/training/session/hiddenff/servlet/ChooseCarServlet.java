package com.training.session.hiddenff.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ChooseCarServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<form action='manufacturer'>"
				+ "Choose Car Type : <select name='car'>"
				+ "<option value='Sedan'>Sedanr</option>"
				+ "<option value='Hatchback'>Hatchback</option>"
				+ "<option value='SUV'>SUV</option>"
				+ "</select>"
				+ "<input type='hidden' name='vehicle' value='"+request.getParameter("vehicle")+"'>"
				+ "<br/>"
				+ "<input type='submit' value='Save'/>"
				+ "</form>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
