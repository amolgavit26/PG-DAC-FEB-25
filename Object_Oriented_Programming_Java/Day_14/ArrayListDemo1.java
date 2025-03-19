package Day_14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		List<Integer> a1 = new ArrayList<>();
		
		a1.add(10);
		a1.add(15);
		a1.add(1);
		a1.add(85);
		a1.add(34);
		a1.add(1);
		

		System.out.println(a1);

		// Traversing : Method 1
		System.out.println("-------for loop-------");
		for(int i = 0; i < a1.size(); i++) {
			System.out.println(i);
		}

		// Traversing : Method 2 
		System.out.println("-------for-each loop-------");
		for( int x : a1) {
			System.out.println(x);
		}
		
		// Traversing : Method 1 
		System.out.println("-------Iterator while-------");
		Iterator<Integer> itr = a1.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		
		
		
	}

}
