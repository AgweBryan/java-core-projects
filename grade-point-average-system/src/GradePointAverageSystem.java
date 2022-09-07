
public class GradePointAverageSystem {

	public static void main(String[] args) {
		Student andy = new Student("Andy");
		
		andy.add("Mathematics", 'C');
		andy.add("Englsih", 'A');
		andy.add("History", 'B');
		andy.add("Geography", 'D');
		
		System.out.println(andy.getName() + " has a GPA of " + andy.getGPA());
		
		System.out.println("GPA is obtained from these subjects: ");
		
		for(String subject: andy.getSubjects()) {
			System.out.println(subject);
		}

	}

}
