package com.msci.ex2;

public class Circle implements Shape{
	private double radius;
	
	public void getParams(String params) {
		radius = Double.parseDouble(params);	
	}

	public double calculateArea(){
		return (Math.PI * radius * radius);
	}


	


}
