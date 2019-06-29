package MyCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyHashMap {
	//unique element
	//Order not maintained
	//Key value

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(11,"Delhi");
		map.put(22,"Mumbai");
		map.put(33,"Kolkata");
		map.put(44,"Chennai");
		map.put(20,"Pune");
		
		System.out.println("========="+map.get(20));
		
		for(HashMap.Entry<Integer, String> m:map.entrySet()) {
			System.out.println("Key = " +m.getKey());
		    System.out.println("value = " +m.getValue());
		
	}

}
}
