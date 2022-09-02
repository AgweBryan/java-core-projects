import java.util.Scanner;

public class WordCounter {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		// show first message to user
		System.out.println("Type in a paragraph:");	
		
		// get input and remove leading and trailing spaces
		String paragraph = (scanner.nextLine()).trim();
		
		// use to ensure that user types in something
		while(paragraph.length() == 0) {
			
			System.out.println("Type in a paragraph");
			
			// get input and remove leading and trailing spaces
			paragraph = (scanner.nextLine()).trim();
		}
		
		// display paragraph to user
		System.out.println("Your paragraph: " + paragraph);
		
		// variable to count number of spaces
		int spaceCount = 0;
		int wordCount = 0;
		
		for (int i = 0; i < paragraph.length(); i++) {
			char characterAt = paragraph.charAt(i);
			
			// Check if current index is ' ' and 
			// next index is not ' ' 
			if(characterAt == ' ' && paragraph.charAt(i + 1) != ' ') {  
				spaceCount++;
			}
			
			
		}
		
		// increment again to get word count
		wordCount = spaceCount + 1;
		
		System.out.println("The number of words in your paragraph is: " + wordCount);
		
		// close scanner
		scanner.close();
	}

}
