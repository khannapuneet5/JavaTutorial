package com.msci.client;

public class Main {

	public static void main(String[] args) {
		CalculatorService calculatorService = new CalculatorService();
		Calculator port = calculatorService.getCalculatorPort();
		System.out.println(port.add(10,  20));
	}

}
