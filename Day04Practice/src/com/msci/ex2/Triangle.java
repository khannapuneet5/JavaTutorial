package com.msci.ex2;

public class Triangle implements Shape{
	private double base;
	private double height;
	
	public void getParams(String params) {
		String[] tempArr = params.split(",");
		base = Double.parseDouble(tempArr[0]);
		height = Double.parseDouble(tempArr[1]);
	}


	public double calculateArea(){
		return (0.5 * base * height);
	}
}
