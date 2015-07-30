import java.util.Scanner;
public class ModuloCounterUser{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("*********************************************************");
		System.out.println("Enter 'n' to create a new ModuloCounter object, 'i' to increment, 'd' to decrement, 'D' to destroy, 'C' for object count, 'q' to quit.");
		System.out.println("*********************************************************");
		String input = in.next();
		ModuloCounter mc1 = null;
		while (!input.equals("q")){
			if (input.equals("n")){
				System.out.println("Enter the limit:->");
				int theLimit = in.nextInt();
				mc1 = new ModuloCounter();
				mc1.setLimit(theLimit);
			}
			else if (input.equals("i")){
				mc1.incrementCounter();
			}
			else if (input.equals("d")){
				mc1.decrementCounter();
			}
			else if (input.equals("D")){
				mc1 = null;
				System.gc();
				ModuloCounter.getObjectCount();
			}
			else if (input.equals("C")){
				ModuloCounter.getObjectCount();
			}
			System.out.println("*********************************************************");
			System.out.println("Enter 'n' to create a new ModuloCounter object, 'i' to increment, 'd' to decrement, 'D' to destroy, 'C' for object count, 'q' to quit.");
			System.out.println("*********************************************************");
			input = in.next();
		}
	}
}