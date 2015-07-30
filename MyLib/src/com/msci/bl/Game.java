package com.msci.bl;

public class Game {
	private int target;
	private int attempts;
	private String message;
	private boolean gameOver;
	public Game(){
		target = (int)(Math.random()*100);
	}
	public void play(int guess){
		attempts++;
		if (guess > target){
			message = "Aim lower";
		}
		else if (guess < target){
			message = "Aim higher";
		}
		else{
			message = "You've got it in " + attempts + " attempts.";
			gameOver = true;
		}
	}
	public int getAttempts() {
		return attempts;
	}
	public String getMessage() {
		return message;
	}
	public boolean isGameOver() {
		return gameOver;
	}
}
