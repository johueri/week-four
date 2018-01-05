package daythreecollectionsandgenerics;

import java.util.ArrayList;
import java.util.Collections;

public class SortDemo {
	public static void main(String[] args) {
		
		
		
		
		String a = "A";
		String b = "a";
		
		System.out.println(b.compareTo(a)); // This shows the amount of characters between one letter and another.
		// "A" vs. "a" distance shows how it distinguishes between cases. Every single character has a value including periods and spaces.
		
		ArrayList<Name> names = new ArrayList<Name>();
		names.add(new Name ("bob", "smith"));
		names.add( new Name("fred", "jones"));
		names.add(new Name ("alan", "kostrick"));
		names.add(new Name ("zach", "williams"));
		
		CompareFirst firstName = new CompareFirst();
		Collections.sort(names, firstName);
		
		System.out.println(names);

}
}
