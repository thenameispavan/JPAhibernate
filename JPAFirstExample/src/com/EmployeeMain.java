package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeMain {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("capg");
		EntityManager em=factory.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		//Employee emp=new Employee(103,"pavan","9876543210","java");
		//em.persist(emp);
		Employee e=em.find(Employee.class, 102);
		//et.commit();
		System.out.println(e.getName()+" "+e.getPhone());
		//em.remove(e);
		//e.setName("Sai Pavan");
		//em.merge(e);
		em.close();
		em.getTransaction().commit();
		factory.close();
	}

}
