import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Amy");
		names.add("Tom");
		names.add("Amy");
		names.add("Billy");
		names.add("Tom");
		names.add("Robert");
		names.add("Amy");
		names.add("Robert");
		names.add("Robert");
		
		System.out.println("Names before checking for duplicates");
		
		for(String name: names) {
			System.out.print(name + " ");
		}
		System.out.println();
		
		int current = 0;
		
		while(current < names.size()) {
			int j = 0;
			boolean isRemoved = false;
			while(j < current) {
				if(names.get(current).equals(names.get(j))) {
					names.remove(current);
					
					isRemoved = true;
					break;
				}
				else {
					j++;
				}
			}
			if(!isRemoved) current++;
			
		}
		System.out.println("Names after checking for duplicates");
		for(String name: names) {
			System.out.print(name + " ");
		}

	}

}
