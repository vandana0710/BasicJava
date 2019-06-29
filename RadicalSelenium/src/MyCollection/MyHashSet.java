package MyCollection;

import java.util.HashSet;
import java.util.Set;


public class MyHashSet {

	public static void main(String[] args) {
		// hashset : insertion order not maintained

		Set<String> mySet = new HashSet<String>();
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