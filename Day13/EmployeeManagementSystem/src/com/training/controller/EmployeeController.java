package com.training.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.pojo.Employee;
import com.training.service.EmployeeService;
import com.training.service.EmployeeServiceImpl;

public class EmployeeController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		String action = request.getServletPath();

		EmployeeService service = new EmployeeServiceImpl();
		
		switch (action) {
		case "/index.mvc":
			try {
				List<Employee> employees = service.getAllEmployees();
				request.setAttribute("employees", employees);
				request.getRequestDispatcher("index.jsp").forward(request, response);
				
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			
			break;
		case "/add.mvc":
			int empId = Integer.parseInt(request.getParameter("empId"));
			String empName = request.getParameter("empName");
			double salary = Double.parseDouble(request.getParameter("salary"));
			
			Employee employee = new Employee(empId, empName, salary);
			
			try {
				service.addEmployee(employee);
				List<Employee> employees = service.getAllEmployees();
				request.setAttribute("employees", employees);
				request.getRequestDispatcher("index.jsp").forward(request, response);

			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "/delete.mvc":
			empId = Integer.parseInt(request.getParameter("empId"));
			try {
				service.deleteEmployee(empId);
				List<Employee> employees = service.getAllEmployees();
				request.setAttribute("employees", employees);
				request.getRequestDispatcher("index.jsp").forward(request, response);

			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "/edit.mvc":
			empId = Integer.parseInt(request.getParameter("empId"));
			empName = request.getParameter("empName");
			salary = Double.parseDouble(request.getParameter("salary"));
			
			employee = new Employee(empId, empName, salary);
			try {
				service.editEmployee(employee);
				List<Employee> employees = service.getAllEmployees();
				request.setAttribute("employees", employees);
				request.getRequestDispatcher("index.jsp").forward(request, response);

			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		default:
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
