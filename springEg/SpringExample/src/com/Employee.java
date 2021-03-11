package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Employee {
	@Value("${emp.id}")
	private int empid;
	@Value("${emp.name}")
	private String name;
	@Autowired
	@Qualifier("add")
	private Address address;
	private List<String> phone;
	
//	
//	public Employee(int empid, String name, Address address) {
//		super();
//		this.empid = empid;
//		this.name = name;
//		this.address = address;
//	}


	public List<String> getPhone() {
		return phone;
	}

	public void setPhone(List<String> phone) {
		this.phone = phone;
	}

	public void printEmployee() {
		
		System.out.println("emp id: "+empid);
		System.out.println("emp name: "+name);
		System.out.println("employee city: "+address.getCity());
		System.out.println("employee country: "+address.getCountry());
		System.out.println("employee zip code: "+address.getZip());
		System.out.println("phone: "+phone);
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
