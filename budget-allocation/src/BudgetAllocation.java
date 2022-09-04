import java.util.ArrayList;
import java.util.Scanner;

public class BudgetAllocation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How much can you spend?");
		// total amount user can spend
		double total = scanner.nextDouble();
		
		// total proportions entered by user
		int sum = 0;
		int i = 0;
		
		ArrayList<Double> proportion = new ArrayList<Double>();
		System.out.println("Enter your proportion of various expenses.");
		System.out.println("The system stops if cumulative proportion exceeds 100%");
		
		while(sum <= 100) {
			System.out.println("Your proportion of expense " + (i + 1) + ":");
			double value = scanner.nextDouble();
			proportion.add(value);
			sum += proportion.get(i);
			i++;
		}
		
		scanner.close();
		
		if(sum > 100) {
			double cumulativeSum = 0.0;
			for (int j = 0; j < proportion.size() - 1; j++) {
				cumulativeSum += proportion.get(j);
			}
			
			proportion.set(proportion.size() -1, 100.0 - cumulativeSum);
		}
		
		for (Double value: proportion) {
			double expense = value * total / 100.0;
			System.out.println("Your " + value + "% equals $" + expense);
			
		}

	}

}
