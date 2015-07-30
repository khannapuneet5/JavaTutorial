import java.util.Scanner;
import java.lang.Math;
public class GuessingGame{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to the guessing game. Please enter your name");
		String name = in.next();
		int target = (int)(100 * (Math.random()));
		System.out.println("Target : " + target);
		System.out.println("Hello " + name + "! Enter a number between 1 and 100.");
		int number = in.nextInt();
		int count = 1;
		while (number != target){
			if (number < target){
				System.out.println("Aim higher");	
			}
			else{
				System.out.println("Aim lower");
			}
			number = in.nextInt();
			count++;
		}
		System.out.println("You've got it " + name + " in " + count + " attempts!!!");
	}
}