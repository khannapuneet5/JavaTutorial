package com.msci.ex3collections;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DecoderUser {

	public static void main(String[] args) {
		Decoder decoder = new Decoder();
		System.out.println("********** All colors in the list **********");
		decoder.printListOfColors();
		System.out.println("********** Colors generated from the list **********");
		List<String> lists = decoder.generateListOfColors();
		Iterator<String> itr = lists.iterator();
		while(itr.hasNext()){
			String tempList = itr.next();
			System.out.print(tempList);
			if (itr.hasNext()){
				System.out.print(",");
			}
		}
		System.out.println();
		System.out.println("********** Lets Play **********");
		String result = "";
		String input = "";
		Scanner in = new Scanner(System.in);
		
		try {
			while (!"Black,Black,Black,Black,Black".equals(result)){
				result = "";
				System.out.println("Enter your input : ");
				input = in.next();
				try {
					itr = decoder.play(input);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("Error! " + e.getMessage());;
				}
				while(itr.hasNext()){
					result += itr.next();
					if (itr.hasNext()){
						result += ",";
					}
				}
				System.out.println(result);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			in.close();
		}
		
		/*decoder.play("Red,Pink,Green,Yellow,Purple");
		decoder.play("Pink,Pink,Pink,Pink,Pink");
		decoder.play("Yellow,Green,Pink,Blue,Purple");*/
	}

}
