import java.io.IOException;
import java.util.Scanner;

public class TryCloseableExampleUser {

	public static void main(String[] args) {
		try(Scanner in = new Scanner(System.in)){
			try{
				int input=0;
				while (input != 10){
					System.out.println("Enter a value: ");
					input = in.nextInt();
					System.out.println("Value entered : " + input);
				}
			}
			catch(Exception ex){
				System.out.println(ex.getMessage());
			}
		}
		
		try(TryCloseableExample tr = new TryCloseableExample()){
			try{
				tr.play();
			}
			catch(Exception ex){
				System.out.println(ex.getMessage());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
