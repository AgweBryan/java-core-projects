
public class CompareStudentMarks {

	public static void main(String[] args) {

		Student helen = new Student("Helen");
		helen.addMarks("English", 60);
		helen.addMarks("Maths", 89);
		helen.addMarks("History", 77);
		
		Student leslie = new Student("Leslie");
		leslie.addMarks("English", 90);
		leslie.addMarks("Math", 82);
		leslie.addMarks("History", 60);
		
		if(helen.compareTo(leslie) > 0) {
			System.out.println(helen.getName() + " has a higher total mark than " + leslie.getName());
			
		}else if(helen.compareTo(leslie) < 0) {
			System.out.println(helen.getName() + " has a lower total mark than " + leslie.getName());
			
		} else {
			System.out.println(helen.getName() + " has the same total marks as " + leslie.getName());
		}

	}

}
