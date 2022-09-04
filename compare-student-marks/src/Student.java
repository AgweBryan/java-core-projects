import java.util.ArrayList;

public class Student implements Comparable<Student>{
	
	private int totalMark;
	private String name;
	private ArrayList<String> subjects;
	private ArrayList<Integer> marks;
	
	Student(String name) {
		this.name = name;
		subjects = new ArrayList<String>();
		marks = new ArrayList<Integer>();
	}
	
	public void addMarks(String subject, int mark) {
		subjects.add(subject);
		marks.add(mark);
		totalMark += mark;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Student other) {
		if(this.totalMark > other.totalMark) return 1;
		else if(this.totalMark == other.totalMark) return 0;
		else return -1;
		
	}


}
