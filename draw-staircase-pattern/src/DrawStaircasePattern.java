import java.util.Scanner;

public class DrawStaircasePattern {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the number of steps");
		int numSteps = scanner.nextInt();
		System.out.println("Please enter the width of each step");
		int stepWidth = scanner.nextInt();
		
		for (int i = 0; i < numSteps; i++) {
			for (int j = 0; j < (i + 1) * stepWidth; j++) {
				System.out.print("#");
			}
			System.out.println();
			
		}
		
		scanner.close();

	}

}
