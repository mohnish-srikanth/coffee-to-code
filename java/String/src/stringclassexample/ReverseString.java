package stringclassexample;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a string");
		String inputString = scanner.nextLine();
		int length = inputString.length();
		
		String reversedString = "";
		for(int i = length - 1; i >= 0; i--) {
			reversedString += inputString.charAt(i);
		}
		
		System.out.println(reversedString);
		scanner.close();
		
	}

}
