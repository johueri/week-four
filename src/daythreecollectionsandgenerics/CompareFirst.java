package daythreecollectionsandgenerics;

import java.util.Comparator;

public class CompareFirst implements Comparator<Name>{
	public int compare(Name one, Name another) {
		return one.getFirstName().compareTo(another.getFirstName());
	}
}