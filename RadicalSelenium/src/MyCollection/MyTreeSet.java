package MyCollection;

import java.util.Set;
import java.util.TreeSet;

public class MyTreeSet {

	public static void main(String[] args) {
		// unique elements only
		// hashset : insertion order not maintained
		// treeset ; ascending order

		Set<String> mySet = new TreeSet<String>();
		mySet.add("Anil");
		mySet.add("Ram");
		mySet.add("Ravi");
		mySet.add("Sonu");
		mySet.add("Monu");
		mySet.add("Shivansh");
		mySet.add("Rashi");
		for (String oneItem : mySet) {
			
			System.out.println(oneItem);
			}
		
			}
	}


