package Day_14;

import java.util.LinkedList;
import java.util.List;

class LinkedListDemo {

	public static void main(String[] args) {

		List<Integer> l1 = new LinkedList<Integer>();		//Upcasting
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		System.out.println(l1);
		
		
		l1.addFirst(5);
		l1.addLast(7);
		System.out.println(l1);
		
	}

}
