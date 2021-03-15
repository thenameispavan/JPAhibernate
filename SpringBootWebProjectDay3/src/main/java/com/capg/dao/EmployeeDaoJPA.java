package com.capg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.bean.Employee;
@Repository
public interface EmployeeDaoJPA extends JpaRepository<Employee, Integer>{

}
