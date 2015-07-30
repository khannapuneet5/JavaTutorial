package com.msci.ex1;
import java.lang.reflect.Constructor;
import java.util.Scanner;

public class ClassApplicationUser {

	public static void main(String[] args) throws ClassNotFoundException {
		String isInterface = "No";
		String isClass = "No";
		String isEnum = "No";
		try(Scanner in = new Scanner(System.in)){
			System.out.println("Enter class name : ");
			String userInput = in.next();
			ClassApplication classMetaData = null; 
			try{
				classMetaData = Class.forName(userInput);
			}
			catch(ClassNotFoundException ex){
				ex.printStackTrace();
			}
			String className = classMetaData.getName();
			System.out.println("Name : " + className);
			System.out.println("Class : " + classMetaData.isClass());
			System.out.println("Enum : " + classMetaData.isEnum());
			System.out.println("Interface : " + classMetaData.isInterface());
			
			Constructor[] constructors = classMetaData.getConstructors();
			
			//System.out.println("Super Class : " + superClassName.getName());
		}
	}

}
