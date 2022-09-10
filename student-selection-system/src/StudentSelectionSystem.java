import java.util.Scanner;

public class StudentSelectionSystem {

	public static void main(String[] args) {

		System.out.println("Enter number of students: ");
		Scanner scanner = new Scanner(System.in);
		
		int numStudents = scanner.nextInt();
		
		String[] students = new String[numStudents];
		int[] ages  = new int[numStudents];
		
		Scanner scanName  = new Scanner(System.in);
		Scanner scanAge = new Scanner(System.in);
		
		for (int i = 0; i < numStudents; i++) {
			System.out.println("Enter name: ");
			students[i] = scanName.nextLine();
			
			System.out.println("Enter age: ");
			ages[i] = scanAge.nextInt();
			
		}
		
		for (int i = 0; i < numStudents; i++) {
			String student = students[i];
			if(ages[i] > 15) {
				System.out.println(student + " can receive a vaccine.");
				System.out.println("The student is now " + ages[i]);
			}
			
		}
		
		scanner.close();
		scanName.close();
		scanAge.close();
		
		

	}

}
