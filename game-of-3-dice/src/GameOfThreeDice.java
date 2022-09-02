import java.util.Scanner;
import java.util.Random;

public class GameOfThreeDice {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random choice = new Random();
		
		
		
		// initialize points to 0
		int playerPoints = 0, computerPoints = 0;
		
		// player prompt to choose target number
		System.out.println("Choose your target number:");
		
		// get player target from input
		int playerTarget = scanner.nextInt();

		// use loop to ensure that user enters number from 1 - 6
		while(playerTarget <= 0 || playerTarget > 6) {
			System.out.println("Choose a number from 1 - 6");
			playerTarget = scanner.nextInt();
		}
		
		// create game object for player and call play method using player info
		Game player = new Game();
		playerPoints = player.play("Player", playerTarget);
		
		System.out.println();
		
		// set a random number as computers target number
		int computerTarget = choice.nextInt(6)+1;
		System.out.println("Computer's target is: " + computerTarget);
		Game computer = new Game();
		computerPoints = computer.play("Computer", computerTarget);
		
		System.out.println();
		// check if player points > computer points
		if(playerPoints > computerPoints) {
			System.out.println("Player wins!");
		}else if(playerPoints < computerPoints) {
			System.out.println("Computer wins!");
		} else System.out.println("Its a draw!");
				
				
		scanner.close();
	}

}
