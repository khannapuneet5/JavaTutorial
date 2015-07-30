import java.util.Scanner;

public class DogUser {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.wakeUp();
		Scanner in = new Scanner(System.in);
		String input = "";
		while (!"q".equals(input)){
			//System.out.println("Enter action: ");
			input = in.next();
			switch (input) {
				case "s":
					dog.goToSleep();
					break;
				case "w":
					if (!dog.isAwake()){
						dog.wakeUp();
					}
					break;
				default:
					break;
				}
		}
		dog.goToSleep();
		in.close();
	}

}
