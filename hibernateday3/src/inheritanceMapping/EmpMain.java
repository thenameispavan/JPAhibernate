package inheritanceMapping;

import java.util.Date;

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
		ContractEmployee emp=new ContractEmployee();
		emp.setName("Sai");
		emp.setDoj(new Date());
		emp.setPayPerHour(20000);
		eManager.persist(emp);
		eTx.commit();
		

	}

}
