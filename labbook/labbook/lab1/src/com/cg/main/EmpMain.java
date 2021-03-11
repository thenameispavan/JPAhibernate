package com.cg.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.Employee;
import com.cg.SBU;

public class EmpMain {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("myBeans2.xml");
		SBU s=(SBU)ctx.getBean("sbuDetails");
		Scanner sc=new Scanner(System.in);
		int eid=sc.nextInt();
		System.out.println(s.findEmployee(eid));
		

	}

}
