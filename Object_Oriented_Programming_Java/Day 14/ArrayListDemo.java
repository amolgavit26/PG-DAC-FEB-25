package Day_14;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();					// Non Type Safe
		ArrayList<String> a11 = new ArrayList<>();		// Type Safe
		List<String> a111 = new ArrayList<>();
		
		a111.add("Robin");
		a111.add("Purva");
		a111.add("Abdulla");
		a111.add("Jivita");
		a111.add("Nikitesh");
		a111.add("Nikitesh");
		a111.add("Ankur");
		a111.add("Siddhi");
		a111.add("Kunal");
		a111.add("Nipun");
		a111.add("Nikitesh");			// can add same values
		
		System.out.println(a111);
		
		System.out.println(a111.get(0));
		System.out.println(a111.get(3));
		
		a111.remove(1);
		System.out.println(a111);
		System.out.println(a111.remove(1));
		
		String x = a111.remove(5);			// can remove the value and store in it a variable
		System.out.println(x);
		
		
		
		
	}

}
