package datastructure;

import java.util.Scanner;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number 120:");
		//Stored the entered value in variable
		int num = scanner.nextInt();
		//Called the user defined function fact
		int factorial = fact(num);
		System.out.println("Factorial of entered number is: 120 "+factorial);
	}
	static int fact(int n)
	{
		int output;
		if(n==1){
			return 1;
		}
		//Recursion: Function calling itself!!
		output = fact(n-1)* n;
		return output;


	}

}
