import java.util.Scanner;

public class ControlStructures{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("What is your name ? ");
		String str = in.next();
		System.out.println("Hello " + str);
		for (int k=0; k<10; k++){
			System.out.println("What the hell is going on?");
		}
		int a = 0;
		while (a < 5){
			System.out.println("Scratch my head");
			a++;
		}
		int i=10;
		System.out.println(i);
		boolean b = false;
		System.out.println(b);
		double d = 12.34;
		System.out.println(d);
		if (d == 12){
			System.out.println("d is 12");
		}
		else{
			System.out.println("d is not 12, its " + d);
		}
	}
}