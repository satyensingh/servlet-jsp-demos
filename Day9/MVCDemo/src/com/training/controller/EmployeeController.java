package com.training.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.model.pojo.Employee;

public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String action = request.getServletPath();
		if(action.equals("/Input.mvc")) {
			response.sendRedirect("input.html");
		}
		else if(action.equals("/DisplayEmp.mvc")) {
			int empId = Integer.parseInt(request.getParameter("txtEmpId"));
			String empName = request.getParameter("txtEmpName");
			double salary = Double.parseDouble(request.getParameter("txtEmpSalary"));
			
			Employee employee = new Employee(empId, empName, salary);
			
			request.setAttribute("employee", employee);
			request.getRequestDispatcher("Display").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}