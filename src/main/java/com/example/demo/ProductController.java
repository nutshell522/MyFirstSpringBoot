package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/product")
@RestController
public class ProductController {
	@RequestMapping("/test")
	public Store product() {
		Store store = new Store();
		List<String> list = new ArrayList<>();
		list.add("蘋果");
		list.add("橘子");
		store.setProducts(list);
		return store;
	}
	@RequestMapping("/buy")
	public String buy() {
		return "200元";
	}
}
