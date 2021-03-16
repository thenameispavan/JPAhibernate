package com.capg.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.demo.bean.Employee;
import com.capg.demo.dao.EmployeeDaoJPA;
@Service("jpaService")
public class EmployeeServiceJPA implements EmployeeService{
	@Autowired
	EmployeeDaoJPA eDao;
	@Override
	public List<Employee> printAllEmployee() {
		
		return eDao.findAll();
	}

	@Override
	public Employee findEmployee(int empid) {
		Optional<Employee> op=eDao.findById(empid);
		if(op.isPresent())
		return op.get();
		else
			return null;
	}

	@Override
	public List<Employee> createEmployee(Employee emp) {
		eDao.saveAndFlush(emp);
		return eDao.findAll();
	}

	@Override
	public List<Employee> deleteEmployee(int empid) {
		eDao.deleteById(empid);
		return eDao.findAll();
	}

	@Override
	public List<Employee> updateEmployee(Employee emp) {
		eDao.saveAndFlush(emp);
		return null;
	}

	@Override
	public List<Employee> findByName(String name) {
		return eDao.findByName(name);
	}
	

}