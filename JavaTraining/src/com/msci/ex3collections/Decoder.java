package com.msci.ex3collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Decoder {
	private List<String> colorList;
	private List<String> newColorList;
	private int numOfBlacks;
	private int numOfWhites;
	private int numOfReds;
	private boolean flag = false;
	private Iterator<String> itr;
	
	public Decoder(){
		colorList = new ArrayList<String>();
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Yellow");
		colorList.add("Purple");
		colorList.add("Pink");
		colorList.add("Orange");
		colorList.add("Black");
		colorList.add("White");
		colorList.add("Grey");
	}
	
	public List<String> generateListOfColors(){
		newColorList = new ArrayList<String>();
		for (int i=0; i<5; i++){
			String colors = colorList.get(i);
			newColorList.add(colors);
		}
		return newColorList;
	}
	
	public void printListOfColors(){
		itr = colorList.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next());
			if (itr.hasNext()){
				System.out.print(",");
			}
		}
		System.out.println();
	}
	
	public Iterator<String> play(String userInput) throws Exception{
		String[] userInputList = userInput.split(",");
		if (userInputList.length != 5){
			throw new IncorrectInputException("User input incorrect");
		}
		for (int i=0; i<userInputList.length;i++){
			if (userInputList[i].equals(newColorList.get(i))){
				numOfBlacks++;
			}
			else{
				itr = newColorList.iterator();
				flag = false;
				while(itr.hasNext()){
					if (itr.next().equals(userInputList[i]) && !(userInputList[i].equals(newColorList.get(i)))){
						numOfWhites++;
						flag = true;
					}
				}
				if (!flag ){
					numOfReds++;
				}
			}
		}
		List<String> userOutputList = new ArrayList<String>();
		for (int j=0; j<numOfBlacks; j++){
			userOutputList.add("Black");
		}
		for (int k=0; k<numOfWhites; k++){
			userOutputList.add("White");
		}
		for (int l=0; l<numOfReds; l++){
			userOutputList.add("Red");
		}
		
		/*while(itr.hasNext()){
			System.out.print(itr.next());
			if (itr.hasNext()){
				System.out.print(",");
			}
		}*/
		//System.out.println();
		if (numOfBlacks + numOfWhites + numOfReds != 5){
			throw new Exception("Total number not equal to 5 : " + numOfBlacks + "," + numOfWhites + "," + numOfReds);
		}
		numOfBlacks=0;
		numOfWhites=0;
		numOfReds=0;
		return userOutputList.iterator();
	}
}
