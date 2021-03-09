package com.capg.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.capg.config.JPAconfig;
import com.capg.pojo.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	EntityManager eManager= JPAconfig.getEntityManager();
	EntityTransaction et=eManager.getTransaction();
	Employee e;
	@Override
	public String saveEmployee(Employee emp) {	
	et.begin();
	eManager.persist(emp);
	et.commit();
		
		return "Employee Saved";
	}
	@Override
	public Employee getEmployee(int eId) {
	e=eManager.find(Employee.class, eId);
			return e;
			
	}
	@Override
	public String updateEmployee(int id,String name) {
		et.begin();
		e=eManager.find(Employee.class, id);
		e.setName(name);
		et.commit();
		return"Employee name updated";
	}
	@Override
	public String deleteEmployee(int id) {
		et.begin();
		e=eManager.find(Employee.class, id);
		if(e!=null) {
			eManager.remove(e);
			et.commit();
			return "employee deleted";
			}
		else 
			return "employee doesn't exist";
		}

	}
		


