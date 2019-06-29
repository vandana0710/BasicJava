package MyCollection;
import java.util.ArrayList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> myList = new ArrayList<String>();
		myList.add("Anil");
		myList.add("Ram");
		myList.add("Ravi");
		myList.add("Sonu");
		for (String name : myList) {
			System.out.println("element = " +name);
			}
		System.out.println("Single element = " +myList.get(3));
		
		myList.remove("Sonu");
		
		for(String name: myList){
			System.out.println("element = " +name);
			}
		
		
		
	}

}
