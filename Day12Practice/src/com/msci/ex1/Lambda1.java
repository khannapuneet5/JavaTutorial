package com.msci.ex1;


public class Lambda1 {

	public static void main(String[] args) {
		Printer p1 = (String d) -> System.out.println(d);
		p1.print("Lambda expression executed");
		
		wakeUp((String d) -> System.out.println(d));
		wakeUp((String d) -> System.out.println(d.toLowerCase()));
		wakeUp((String d) -> System.out.println(d.toUpperCase()));
	}
	
	public static void wakeUp(Printer printer){
		printer.print("Wakeup");
	}
}

