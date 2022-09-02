import java.util.Random;
import java.util.Scanner;

public class Game {
	Random random;
	Scanner scanner;

	// Number of dice and number of trials per player
	static int NUM_OF_DICE = 3, TRIALS = 5;

	Game() {

		random = new Random();
		scanner = new Scanner(System.in);
	}

	int play(String who, int target) {

		// initialize array with length 3 for the 3 dice
		int[] dice = new int[NUM_OF_DICE];
		int points = 0;
		for (int i = 0; i < TRIALS; i++) {
			for (int j = 0; j < NUM_OF_DICE; j++) {
				// generate a random number of each dice 
				dice[j] = random.nextInt(6) + 1;
			}

			System.out.print("Press enter");
			scanner.nextLine();

			// display result of toss every round
			System.out.print("Round " + (i + 1) + ": ");
			for (int l : dice)
				System.out.print(l + ", ");
			
			
			System.out.println();
			
			for (int k = 0; k < NUM_OF_DICE; k++) {
				// check if k item in dice array equals target.
				// increment points if true
				if (dice[k] == target)
					points++;
			}
		}

		System.out.println(who + " got " + points + " points");
		return points;
	}
}
