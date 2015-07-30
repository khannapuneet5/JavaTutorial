package com.msci.ex2;

public class Square implements Shape{
	private double side;
	
	
	public void getParams(String params) {
		side = Double.parseDouble(params);
	}

	public double calculateArea(){
		return Math.pow(side, 2);
	}
}
