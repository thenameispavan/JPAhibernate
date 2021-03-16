package com.capg.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.demo.bean.Employee;
import com.capg.demo.dao.EmployeeDao;


@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeDao eDao;
	@Override
	public List<Employee> printAllEmployee() {
		
		return eDao.getAllEmployee();
	}
	@Override
	public Employee findEmployee(int empid) {
		
		return eDao.findEmployee(empid);
	}
	@Override
	public List<Employee> createEmployee(Employee emp) {
		if (emp.getEmpid()==0||emp.getName()==null)
		return null;
		else
			return eDao.createEmployee(emp);
	}
	@Override
	public List<Employee> deleteEmployee(int empid) {
		
		return eDao.deleteEmployee(empid);
	}
	@Override
	public List<Employee> updateEmployee(Employee emp) {
		if(emp.getEmpid()==0)
			return null;
		else
			return eDao.updateEmployee(emp);
	}
	@Override
	public List<Employee> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}