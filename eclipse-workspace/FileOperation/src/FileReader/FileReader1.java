package FileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader1 {

	

	public static void main(String[] args) throws FileNotFoundException {
		
		
		
	File file = new File("/Users/siembrahielotrucho/Desktop/filereader.txt");
	
	Scanner scanner = new Scanner(file);
	
	System.out.println(scanner.nextLine());
	
	
	
	
	}
}