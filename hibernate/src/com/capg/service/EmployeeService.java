package com.capg.service;

import com.capg.pojo.Employee;

public interface EmployeeService {
	public String createEmployee(Employee emp);
	public Employee getEmp(int id);
	public String updateEmp(int id,String name);
	public String deleteEmp(int id);
}
