package com.training.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.model.pojo.Employee;

public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Employee employee = (Employee) request.getAttribute("employee");
		PrintWriter out = response.getWriter();
		out.print("<div><a href='Logout.mvc'>Logout</a></div>");
		out.print("<h1>Employee Id : "+employee.getEmpId()+"</h1>");
		out.print("<h1>Employee Name : "+employee.getEmpName()+"</h1>");
		out.print("<h1>Employee Salary : "+employee.getSalary()+"</h1>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}