package com.cg.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAconfig {
	private static EntityManagerFactory factory;
	private static EntityManager em;
	static{
		factory=Persistence.createEntityManagerFactory("labbook");
	}
	public static EntityManager getEntityManager() {
		if(em==null||!em.isOpen()) {
			em=factory.createEntityManager();
		}
		return em;
	}
	
}
