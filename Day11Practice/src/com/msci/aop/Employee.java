package com.msci.aop;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Employee {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void work(){
		System.out.println(id + " is coding");
	}
	
	public void sleep(){
		System.out.println(id + " is dozing");
	}
}
