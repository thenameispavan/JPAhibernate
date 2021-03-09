package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmpMain {

	public static void main(String[] args) {
		EntityManagerFactory eFactory=Persistence.createEntityManagerFactory("day3");
		EntityManager eManager=eFactory.createEntityManager();
		EntityTransaction eTx= eManager.getTransaction();
		eTx.begin();
//		Address add= new Address(112, "Chennai", "India", 600062);
//		Employee emp=new Employee(102, "Chai Thai Nya", "THOPU", 5000, add);
//		eManager.persist(emp);
		Employee e=eManager.find(Employee.class, 101);
		eManager.remove(e);
		
		eTx.commit();
		
		
	}

}
