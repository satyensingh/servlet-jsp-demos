package com.training.session.hiddenff.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ChooseModel extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<form action='display'>"
				+ "Choose Model : <select name='model'>"
				+ "<option value='Model 1'>Model 1</option>"
				+ "<option value='Model 2'>Model 2</option>"
				+ "<option value='Model 3'>Model 3</option>"
				+ "</select>"
				+ "<input type='hidden' name='vehicle' value='"+request.getParameter("vehicle")+"'>"
				+ "<input type='hidden' name='car' value='"+request.getParameter("car")+"'>"
				+ "<input type='hidden' name='manufacturer' value='"+request.getParameter("manufacturer")+"'>"
				+ "<br/>"
				+ "<input type='submit' value='Save'/>"
				+ "</form>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
