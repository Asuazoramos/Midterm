package datastructure;

import java.util.ArrayList;
import java.util.Collections;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList<String> control=new ArrayList<>();
		control.add("pedro");
		control.add("juan");
		control.add("marcos");
		control.add("luis");
		control.add("alex");
		System.out.println("control");
		System.out.println("peek(): "+control);
		control.remove("pedro");
		for(String str:control)
			System.out.println(str);
		ArrayList<String> banana = new ArrayList<>();
		banana.add("flavors");
		banana.add("cookies");
		banana.add("fruits");
		Collections.sort(banana);


		for (String str : banana) {
			System.out.println(str);
		}













	}

}
