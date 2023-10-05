package com.example.demo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CanonPrinter implements Printer {
	@Value("${printer.count}")
	private int count;
	
	@Value("${printer.name:喔喔}")
	private String name;

	@Override
	public void print(String message) {
		count--;
		System.out.println("CanonPrinter "+message);
		System.out.println("剩餘使用次數"+count);
		System.out.println(name);
		print2(message);
	}

	public void print2(String message) {
		count--;
		System.out.println("CanonPrinter "+message);
		System.out.println("剩餘使用次數"+count);
		System.out.println(name);
		
	}
//	@Override
//	public void afterPropertiesSet() throws Exception {
//		count=20;
//		
//	}

}
