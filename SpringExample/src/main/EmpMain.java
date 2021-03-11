package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Employee;

public class EmpMain {

	public static void main(String[] args) {
		ApplicationContext ct= new ClassPathXmlApplicationContext("myBeans.xml");
		Employee emp=(Employee)ct.getBean("emp");
		emp.printEmployee();

	}

}
