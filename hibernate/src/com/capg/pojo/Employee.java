package com.capg.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="EmployeeDetails")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int empId;
	@Column(name="EmployeeName")
	private String name;
	private double salary;
	@Temporal(TemporalType.DATE)
	@Column(name="DateOfJoining")
	private Date doj;
	public Employee() {
		
	}
	public Employee(String name, double salary, Date doj) {
		super();
		this.name = name;
		this.salary = salary;
		this.doj = doj;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public String toString() {
		return this.name+"\t"+this.salary+"\t"+this.doj;
	}
}
