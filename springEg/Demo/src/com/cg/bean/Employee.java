package com.cg.bean;

public class Employee {
	private int empid=101;
	private String name="pavan";
	private Address address;
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
	public void printEmployee() {
		System.out.println("emp id: "+empid);
		System.out.println("emp name: "+name);
		System.out.println("employee city: "+address.getCity());
		System.out.println("employee country: "+address.getCountry());
		System.out.println("employee zip code: "+address.getZip());
	}
}
