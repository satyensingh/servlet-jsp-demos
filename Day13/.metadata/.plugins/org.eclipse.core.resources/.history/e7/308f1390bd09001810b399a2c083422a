package com.training.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLType;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.training.pojo.Employee;
import com.training.util.DBUtil;

public class EmployeeDAOImpl implements EmployeeDAO {

	private Connection connection;
	private Statement statement;
	private PreparedStatement preparedStatement;
	private CallableStatement callableStatement;
	private ResultSet resultSet;

	@Override
	public void addEmployee(Employee employee) throws ClassNotFoundException, SQLException {
		connection = DBUtil.getConnection();
		connection.setAutoCommit(false);
		String sql = "INSERT INTO EMP(empno, ename, sal, deptno) values(?,?,?,10)";
		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, employee.getEmpId());
		preparedStatement.setString(2, employee.getEmpName());
		preparedStatement.setDouble(3, employee.getSalary());
		preparedStatement.executeUpdate();
		connection.commit();
		preparedStatement.close();
	}

	@Override
	public List<Employee> getAllEmployees() throws ClassNotFoundException, SQLException {
		List<Employee> employees = new ArrayList<>();
		connection = DBUtil.getConnection();
		statement = connection.createStatement();
		String sql = "Select * from emp";
		resultSet = statement.executeQuery(sql);
		while(resultSet.next()) {
			int empId = resultSet.getInt("empno");
			double salary = resultSet.getDouble("sal");
			String empName = resultSet.getString("ename");
			Employee employee = new Employee(empId,empName, salary);
			employees.add(employee);
		}
		resultSet.close();
		statement.close();
		return employees;
	}

	@Override
	public String getEmployeeNameById(int empid) throws ClassNotFoundException, SQLException {
		connection = DBUtil.getConnection();
		String sql = "{call GetEmpNameById(?, ?)}";
		callableStatement = connection.prepareCall(sql);
		callableStatement.setInt(1, empid);
		callableStatement.registerOutParameter(2, java.sql.Types.VARCHAR);
		callableStatement.executeUpdate();
		String empName = callableStatement.getString(2);
		System.out.println(empName);
		return empName;
	}

}
