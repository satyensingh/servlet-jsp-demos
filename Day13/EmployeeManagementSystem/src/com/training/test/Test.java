package com.training.test;

import java.sql.SQLException;
import java.util.List;

import com.training.pojo.Employee;
import com.training.service.EmployeeService;
import com.training.service.EmployeeServiceImpl;
import com.training.util.DBUtil;

public class Test {

	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeServiceImpl();
		try {
			
//			Employee newEmployee = new Employee(204, "Shreya", 40000);
//			employeeService.addEmployee(newEmployee);
//			
//			
//			List<Employee> employees = employeeService.getAllEmployees();
//			for (Employee employee : employees) {
//				System.out.println(employee);
//			}
			
			String empName = employeeService.getEmployeeNameById(202);
			System.out.println(empName);
			
			DBUtil.closeConnection();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
