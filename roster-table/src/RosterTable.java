import java.util.ArrayList;

public class RosterTable {

	public static void main(String[] args) {

		int days = 3;
		
		ArrayList<ArrayList<String>> roster = new ArrayList<>(days);
		
		ArrayList<String> day1 = new ArrayList<String>();
		ArrayList<String> day2 = new ArrayList<String>();
		ArrayList<String> day3 = new ArrayList<String>();
		
		day1.add("Alice");
		day1.add("Bob");
		roster.add(day1);
		
		day2.add("Alice");
		day2.add("Sam");
		day2.add("Mike");
		roster.add(day2);
		
		day3.add("Ray");
		day3.add("Sam");
		roster.add(day3);
		
		getDays(roster, "Alice");
		getDays(roster, "Ray");

	}

	public static void getDays(ArrayList<ArrayList<String>> roster, String name) {
		System.out.println("Days when " + name + " is on duty");
		for(ArrayList<String> names: roster) {
			for(String str: names) {
				if(str.contentEquals(name)) {
					System.out.println("day " + (roster.indexOf(names) + 1) + ": " + (roster.indexOf(names) + 1));
				}
			}
		}
		
	}

}
