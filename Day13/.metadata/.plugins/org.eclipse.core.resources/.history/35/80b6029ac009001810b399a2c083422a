package com.training.service;

import java.sql.SQLException;
import java.util.List;

import com.training.dao.EmployeeDAO;
import com.training.dao.EmployeeDAOImpl;
import com.training.pojo.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDAO dao = new EmployeeDAOImpl();
	
	public void addEmployee(Employee employee) throws ClassNotFoundException, SQLException {
		dao.addEmployee(employee);
	}

	public List<Employee> getAllEmployees() throws ClassNotFoundException, SQLException {
		return dao.getAllEmployees();
	}

	@Override
	public String getEmployeeNameById(int empid) throws ClassNotFoundException, SQLException {
		return dao.getEmployeeNameById(empid);
	}

}
