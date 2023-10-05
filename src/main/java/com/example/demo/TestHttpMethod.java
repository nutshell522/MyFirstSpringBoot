package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestHttpMethod {
	
	@RequestMapping("/testGet")
	// public String testGet(@RequestParam(required = false) Integer id,
	public Integer testGet(@RequestParam(defaultValue = "666") Integer id,
							@RequestParam String name) {
		return id;
	}
	@RequestMapping("/testPost")
	public String testPost(@RequestBody Pet pet) {
		return pet.getName();
	}
	@RequestMapping("/testRequestHeader")
	public String testRequestHeader(@RequestHeader(name = "Content-Type") String info) 
	//public String testRequestHeader(@RequestHeader String info)
	{
		return info;
	}
	
	@RequestMapping("/testPathVariable/{id}/{name}")
	public Integer testPathVariable(@PathVariable Integer id,@PathVariable String name) 
	{
		return id;
	}
}
