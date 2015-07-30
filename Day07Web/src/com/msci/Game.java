package com.msci;

public class Game {
	private static int attempts;
	private String in;
	private boolean gameOver = false;
	public Game(String input){
		this.in = input;
	}
	
	public String play(){
		int input = Integer.parseInt(in);
		int target = 90; //(int)(Math.random() * 10);
		
	}
}
