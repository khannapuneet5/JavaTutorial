package com.msci.ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ShapesUser {

	public static void main(String[] args) throws Exception {
		try(Scanner in = new Scanner(new File("C:\\Users\\X_training\\prabhu\\Jul_2015\\Day04\\shapes.txt"))){
			String input = "";
			String [] inputArr = null;
			while (in.hasNextLine()){
				input = in.nextLine();
				inputArr = input.split("->");
				Class shapeCls = Class.forName("com.msci.ex2." + inputArr[0]);
				Shape shape = (Shape)shapeCls.newInstance();
				shape.getParams(inputArr[1]);
				System.out.println("Area of " + inputArr[0] +  " : " + shape.calculateArea());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error reading file");
		}
		
	}

}
