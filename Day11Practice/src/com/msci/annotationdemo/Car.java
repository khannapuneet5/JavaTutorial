package com.msci.annotationdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
	private String model;
	private int yearOfMake;
	
	@Autowired	
	public Car(@Value("Audi")String model, @Value("2000")int yearOfMake) {
		super();
		this.model = model;
		this.yearOfMake = yearOfMake;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYearOfMake() {
		return yearOfMake;
	}
	public void setYearOfMake(int yearOfMake) {
		this.yearOfMake = yearOfMake;
	}
	
	
}
