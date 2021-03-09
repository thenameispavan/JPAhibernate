package com.capg.service;

import com.capg.dao.EmployeeDao;
import com.capg.dao.EmployeeDaoImpl;
import com.capg.pojo.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	EmployeeDao eDao=new EmployeeDaoImpl();
	@Override
	public String createEmployee(Employee emp) {
		if(emp.getName().length()<4||emp.getSalary()<20000) {
			return "Invalid Employee";
		}
		else {
			return eDao.saveEmployee(emp);
		}
		//eDao.saveEmployee(emp);
		//return null;
	}
	@Override
	public Employee getEmp(int id) {
		return eDao.getEmployee(id);

	}
	@Override
	public String updateEmp(int id, String name) {
		if(name.length()>4) {
			return eDao.updateEmployee(id, name);
		}
		else
			return "name must be greater than 4 characters";
		
	}
	@Override
	public String deleteEmp(int id) {
		return eDao.deleteEmployee(id);

	}

}
