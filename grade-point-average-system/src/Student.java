import java.util.ArrayList;
public class Student {
	private String name;
	private ArrayList<String> subjects;
	private ArrayList<Character> grades;
	
	public Student(String name) {
		this.name = name;
		subjects = new ArrayList<String>();
		grades = new ArrayList<Character>();
	}
	
	public void add(String subject, char grade) {
		subjects.add(subject);
		grades.add(grade);
	}

	public String getName() {
		return name;
	}
	
	public ArrayList<String> getSubjects() {
		return subjects;
	}
	
	public double getGPA() {
		double totalPoint = 0.0;
		for(char grade: grades) {
			switch(grade) {
			case 'A':
				totalPoint += 4.0;
				break;
			case 'B':
				totalPoint += 3.0;
				break;
			case 'C':
				totalPoint += 2.0;
				break;
			case 'D':
				totalPoint += 1.0;
				break;
			case 'F':
				totalPoint += 0.0;
				break;
			default:
				totalPoint += 0.0;
				break;
			}
		}
		return totalPoint / grades.size();
	}
}
