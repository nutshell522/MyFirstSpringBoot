package com.example.demo;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;

@RequestMapping("/employee")
@RestController
@Validated
public class testRESTfulAPI {
	
	// 若刪除@Valid，則不會欄位驗證
	@PostMapping
	public String create(@RequestBody @Valid Employee employee) {
		return "create successed";
	}
	
	// 可將驗證規則直接加在參數前，需在class上加上@Validated
	@GetMapping("{employeeName}")
	public String read(@PathVariable @Size(min = 0,max = 3) String employeeName) {
		return employeeName;
	}
	@PutMapping("{employeeName}")
	public String update(@PathVariable String employeeName) {
		return "update " + employeeName + " successed";
	}
	@DeleteMapping("{employeeName}")
	public String delete(@PathVariable String employeeName) {
		return "delete " + employeeName + " successed";
	}

}
