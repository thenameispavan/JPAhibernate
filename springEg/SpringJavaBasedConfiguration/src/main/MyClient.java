package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.Employee;
import com.HelloWorld;

import config.JavaConfig;

public class MyClient {

	public static void main(String[] args) {
		AbstractApplicationContext ctx=new AnnotationConfigApplicationContext(JavaConfig.class);
//		HelloWorld h=(HelloWorld)ctx.getBean("hello");
//		HelloWorld h1=(HelloWorld)ctx.getBean("hello");
//		System.out.println(h);
//		System.out.println(h1);
//		System.out.println(h.sayHello());
		Employee emp=(Employee)ctx.getBean("employee");
		emp.printEmployee();
	}

}
