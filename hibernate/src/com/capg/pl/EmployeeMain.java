package com.capg.pl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.capg.pojo.Employee;
import com.capg.service.EmployeeService;
import com.capg.service.EmployeeServiceImpl;

public class EmployeeMain {

	public static void main(String[] args) throws Exception {
		Scanner s=new Scanner(System.in);
		Employee emp;
		EmployeeService eService=new EmployeeServiceImpl();
		String con=s.next();
		while(con.equalsIgnoreCase("yes")) {
			System.out.println("enter 1 to save employee: ");
			System.out.println("enter 2 to find employee: ");
			System.out.println("enter 3 to update employee name: ");
			System.out.println("enter 4 to delete employee: ");
			int i=s.nextInt();
			switch(i) {
			case 1:
				System.out.println("enter name: ");
				String name=s.next();
				System.out.println("enter salary: ");
				double salary=s.nextDouble();
				System.out.println("enter date: ");
				String date=s.next();
				Date doj=new SimpleDateFormat("yyyy/mm/dd").parse(date);
				emp=new Employee(name,salary,doj);
				System.out.println(eService.createEmployee(emp));
				break;
			case 2:
				System.out.println("enter employee id");
				int id=s.nextInt();
				System.out.println(eService.getEmp(id));
				break;
			case 3:
				System.out.println("enter employee id: ");
				int eid=s.nextInt();
				System.out.println("enter new name: ");
				String e_name= s.next();
				System.out.println(eService.updateEmp(eid, e_name));
				break;
			case 4:
				System.out.println("enter employee id");
				int empid=s.nextInt();
				System.out.println(eService.deleteEmp(empid));
				break;
				
			default:
				System.out.println("invalid option");
			}
			System.out.println("do you want to continue again");
			con=s.next();
			
		}
		System.out.println("exited!");
		
	}

}
