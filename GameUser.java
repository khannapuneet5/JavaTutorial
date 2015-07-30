import com.msci.bl.Game;
import java.util.Scanner;

public class GameUser{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Game game = new Game();
		while (!game.isGameOver()){
			int guess = sc.nextInt();
			game.play(guess);
			System.out.println(game.getMessage());
		}
	}
}