package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@Autowired
	@Qualifier("hpPrinter")
	private Printer printer;
	
	@RequestMapping("/test")
	public String test() {
		printer.print("Hello World!");
		return "Hello World";
	}
	@RequestMapping("/employee")
	public Employee employee() {
		Employee employee = new Employee();
		employee.age =30;
		employee.name="Ted";
		return employee;
		
	}
}
