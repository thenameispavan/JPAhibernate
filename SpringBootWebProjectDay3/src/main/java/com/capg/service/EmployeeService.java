package com.capg.service;

import java.util.List;

import com.capg.bean.Employee;

public interface EmployeeService {
	public List<Employee> printAllEmployee();
	public Employee findEmployee(int empid);
	public List<Employee> createEmployee(Employee emp);
	public List<Employee> deleteEmployee(int empid);
	public List<Employee> updateEmployee(Employee emp); 

}
