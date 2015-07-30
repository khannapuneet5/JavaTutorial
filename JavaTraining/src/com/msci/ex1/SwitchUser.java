package com.msci.ex1;
import java.util.Scanner;
public class SwitchUser{
	public static void main(String[] args) {
		System.out.println("Please enter 'on' to turn on, 'off' to turn off, 'd' to display the current position and 'q' to quit.");
		Switches switches = new Switches();
		Scanner in = new Scanner(System.in);
		String input = "";
		while (!"q".equals(input)){
			try {
				switch(input){
					case "on":
						switches.turnOn();
						System.out.println("Switch turned on");
						break;
					case "off":
						switches.turnOff();
						System.out.println("Switch turned off");
						break;
					case "d":
						System.out.println("Current switch position : " + switches.display());
						break;
				}
			} catch (SwitchAlreadyOnException e) {
				System.out.println("ERROR : " + e.getMessage());
			} catch (SwitchAlreadyOffException e) {
				System.out.println("ERROR : " + e.getMessage());
			} 
			finally{
				input = in.next();
			}
		}
		in.close();
	}
}