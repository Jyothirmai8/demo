package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmplyeeController {
	
	@RequestMapping("allEmployee")
	public List<Employee> displayAllEmployee(){
		List<Employee> e=new ArrayList<Employee>();
		Employee e1=new Employee();
		e1.setName("Rajesh");
		e1.setPasword("abcd");
		e1.setEmail("abc@gmail.com");
		e1.setAddress("Bangalore");
		e.add(e1);
		return e;
	}
}