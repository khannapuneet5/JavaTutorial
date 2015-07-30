package com.msci.ex2;

public class Rectangle implements Shape{
	private double length;
	private double breadth;
	
	public void getParams(String params) {
		String[] tempArr = params.split(",");
		length = Double.parseDouble(tempArr[0]);
		breadth = Double.parseDouble(tempArr[1]);
	}

	public double calculateArea(){
		return length * breadth;
	}
	
}
