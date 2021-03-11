package com.cg;

import java.util.List;

public class SBU {
	private String sbuId;
	private String sbuName;
	private String sbuHead;
	private List<Employee> empList;
	
	public SBU(String sbuId, String sbuName, String sbuHead, List<Employee> empList) {
		super();
		this.sbuId = sbuId;
		this.sbuName = sbuName;
		this.sbuHead = sbuHead;
		this.empList = empList;
	}
	public String getSbuId() {
		return sbuId;
	}
	public void setSbuId(String sbuId) {
		this.sbuId = sbuId;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	public Employee findEmployee(int id) {
		for(Employee e:empList) {
			if(e.getEmpId()==id)
				return e;
			
		}
		return null;
		
	}
	
	public String toString() {
		return sbuId+" "+sbuName+" "+sbuHead+empList;
	}
}
