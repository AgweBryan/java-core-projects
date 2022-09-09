
import java.util.Arrays;
import java.util.Random;

public class LotteryNumberGenerator {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int min = 1, max = 49, slots = 6;
		
		int[] lotteryArray = new int[slots];
		boolean isReapeted;
		int randomNumber = 0;
		
		for(int indexDrawn = 0; indexDrawn < slots; indexDrawn++) {
			do {
				isReapeted = false;
				// 1 to 49
				randomNumber = random.nextInt(max + 1 - min) + min;
				// check for repeated number against
				// the filled non-zero elements
				
				for(int k = 0; k<= indexDrawn; k++) {
					// check against each filled non-zero elements
					// hope that none repeats the random number
					if(lotteryArray[k] == randomNumber) {
						isReapeted = true;
						break;
					}
				}
				
			} while (isReapeted);
			
			lotteryArray[indexDrawn] = randomNumber;
		}
		
		Arrays.sort(lotteryArray);
		
		System.out.println("The result of the lottery");
		
		for (int i = 0; i < slots; i++) {
			System.out.print(lotteryArray[i] + " ");
			
		}

	}

}
