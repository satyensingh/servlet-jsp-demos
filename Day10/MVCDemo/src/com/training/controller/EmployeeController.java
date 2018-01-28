package com.training.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.training.model.pojo.Employee;

public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String action = request.getServletPath();
		HttpSession httpSession = request.getSession();
		
		switch (action) {
		case "/Input.mvc":
			if(httpSession.getAttribute("username")!=null) {
				//httpSession.setMaxInactiveInterval(60*10);//See web.xml as well for declarative
				response.sendRedirect("input.html");
			}else {
				response.sendRedirect("login.html");
			}
			break;

		case "/DisplayEmp.mvc":
			int empId = Integer.parseInt(request.getParameter("txtEmpId"));
			String empName = request.getParameter("txtEmpName");
			double salary = Double.parseDouble(request.getParameter("txtEmpSalary"));
			
			Employee employee = new Employee(empId, empName, salary);
			
			request.setAttribute("employee", employee);
			request.getRequestDispatcher("Display").forward(request, response);
			break;
		case "/LoginForm.mvc":
			response.sendRedirect("login.html");
			break;
		case "/Login.mvc":
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			
			if(username.equals("satyen") && password.equals("password")) {
				httpSession.setAttribute("username", username);
				response.sendRedirect("input.html");
			}else {
				response.sendRedirect("login.html");
			}
			
			break;
			
		case "/Logout.mvc":
			httpSession.invalidate();
			response.sendRedirect("login.html");
			break;
		default:
			break;
		}
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
