package datastructure;


import string.problems.Permutation;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */

		Queue<String> control = new LinkedList<>();
		control.add("blue eyes");
		control.add("red car");
		control.add("pink");
		control.add("size12");
		System.out.println("peek:"+control.peek());
		System.out.println("Removed element: "+control.remove());
		System.out.println("poll(): "+control.poll());


		Iterator iterator = control.iterator();
		while(iterator.hasNext()) {
			String element = (String) iterator.next();
		}
		 for(Object object:control) {
		 	String element = (String)object;
		 }









	}
}