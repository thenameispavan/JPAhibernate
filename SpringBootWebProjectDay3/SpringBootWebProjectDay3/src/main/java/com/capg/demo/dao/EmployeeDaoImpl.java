package com.capg.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.capg.demo.bean.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	private static List<Employee> empList;
	static{
		empList=new ArrayList<Employee>();
		empList.add(new Employee(102,"Shiva",50000,LocalDate.parse("1999-12-02")));
		empList.add(new Employee(103,"Shubash",45000,LocalDate.parse("1999-12-02")));
		empList.add(new Employee(104,"Shobhan",55000,LocalDate.parse("1999-12-02")));
		empList.add(new Employee(105,"Shravan",60000,LocalDate.parse("1999-12-02")));
	}
	@Override
	public List<Employee> getAllEmployee() {
		
		return empList;
	}
	@Override
	public Employee findEmployee(int empid) {
		for(Employee e:empList) {
			if(e.getEmpid()==empid) {
				return e;
			}
			else
				return null;
		}
		return empList.stream().filter(e->e.getEmpid()==empid).collect(Collectors.toList()).get(0);
	}
	@Override
	public List<Employee> createEmployee(Employee emp) {
		empList.add(emp);
		return empList;
	}
	@Override
	public List<Employee> deleteEmployee(int empid) {
		Employee e=findEmployee(empid);
		if(e!=null) {
			empList.remove(e);
			return empList;
		}
		else
			return null;
	}
	@Override
	public List<Employee> updateEmployee(Employee emp) {
		int counter=0;
		for(Employee e:empList) {
			if(e.getEmpid()==emp.getEmpid()) {
				empList.set(counter, emp);
				return empList;
			}
			counter++;
		}
		return null;
	}

}
