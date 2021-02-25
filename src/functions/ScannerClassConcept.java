package functions;

import java.util.Scanner;

public class ScannerClassConcept {

	public static void main(String[] args) {
		
		//Print Integer - entered by user from console/command line
		
		Scanner reader = new Scanner(System.in);
		System.out.println("please enter the number: ");
		int num = reader.nextInt();
		System.out.println("you entered: " + num);
		
	}

}
