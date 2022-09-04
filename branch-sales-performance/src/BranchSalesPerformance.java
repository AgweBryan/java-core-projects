import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BranchSalesPerformance {

	public static void main(String[] args) throws FileNotFoundException  {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter file name, including extension(e.g file.txt)");
		String fileName = scanner.nextLine();
		
		// use inputed fileName as file path 
		File file = new File(fileName);
		scanner.close();

		scanner = new Scanner(file);
		
		// yearly sum for all branches
		double yearlySum = 0;
		
		// quarter sum for all branches
		double[] quarterlySum = new double[4];
		
		// current value in file being processed
		int count = 0;
		
		
		while(scanner.hasNextDouble()) {
			double sales = scanner.nextDouble();
			yearlySum += sales;
			
			// quater 0, 1, 2 and 3
			int quarter = count % 4;
			quarterlySum[quarter] += sales;
			count++;
		}
		
		scanner.close();
		System.out.println(yearlySum);
		
		for(int i = 0; i < 4; i++) {
			System.out.println(quarterlySum[i]);
		}
		
	}

}
