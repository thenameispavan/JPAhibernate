package com.capg.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.demo.bean.Employee;
import com.capg.demo.service.EmployeeService;

@RestController //restcontroller is@controller + @responsebody
@RequestMapping("/employee")
public class MyController {
	@Autowired
	EmployeeService jpaService;
	//@RequestMapping("/all")
	@GetMapping(value = "/all")
	public List<Employee> printEmployees(){
		return jpaService.printAllEmployee();
	}
//	@RequestMapping("/create")
//	public Employee createEmployee() {
//		return new Employee(101, "Pavan", 55000,LocalDate.parse("1999-12-02"));
//	}
	@RequestMapping("/delete")
	public String deleteEmployee() {
		return "Employee deleted";
	}
	@GetMapping("/{empid}")
	public ResponseEntity<Employee> findEmployee(@PathVariable int empid) {
		Employee e= jpaService.findEmployee(empid);
		if(e!=null)
			return new ResponseEntity<Employee>(e,HttpStatus.OK);
		else
			return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
	}

	@PostMapping(value = "/create"/* ,consumes = MediaType.APPLICATION_JSON_VALUE */)
	public List<Employee> saveEmployee(@RequestBody Employee emp) {
		return jpaService.createEmployee(emp);
		
	}
	@DeleteMapping("/{empid}")
	public List<Employee> deleteEmployee(@PathVariable int empid){
		return jpaService.deleteEmployee(empid);
	}
	@PutMapping
	public List<Employee> updateEmployee(@RequestBody Employee emp){
		return jpaService.updateEmployee(emp);
	}
	@GetMapping("name/{name}")
	public List<Employee> findEmployeeByName(@PathVariable String name){
		return jpaService.findByName(name);
	}
	

}
