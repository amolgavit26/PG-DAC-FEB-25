package Day_14;


import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> hm = new HashMap<>();		// unordered  no Insertion Order
		
		hm.put(101, "Aditya");
		hm.put(2, "Dhanush");
		hm.put(3, "Shweta");
		hm.put(4, "Shweta");		// Duplicate value not allowed
		hm.put(4, "Shweta");		// Duplicate key not allowed
		hm.put(4, "Rohan");
		hm.put(1, "Rohini");
		hm.put(115, "");			// null value allowed
		hm.put(116, "");
		
		System.out.println(hm);
		
		System.out.println(hm.get(101));
		System.out.println(hm.get(3));
		
		hm.remove(1);
		System.out.println(hm);
		System.out.println(hm.remove(4));
		
		String x = hm.remove(101);			// can remove the value and store in it a variable
		System.out.println(x);
		
		
		
	}

}
