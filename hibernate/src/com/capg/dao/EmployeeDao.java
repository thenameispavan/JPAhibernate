package com.capg.dao;

import com.capg.pojo.Employee;

public interface EmployeeDao {
 public String saveEmployee(Employee emp);
 public Employee getEmployee(int eId);
 public String updateEmployee(int id,String name);
 public String deleteEmployee(int id);
 //public Employee displayEmployees();
}
