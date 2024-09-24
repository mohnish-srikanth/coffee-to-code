package loops;

import java.util.Random;
import java.util.Scanner;

public class InfiniteLoop {

	public static void main(String[] args) {
		
		// number guessing
		Random random = new Random();
		int generatedNumber = random.nextInt(5, 100); // smallest = 5 and biggest = 99
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number between 5 and 100");
		while (true) {
			int userInput = scanner.nextInt(); // this is inside the loop as we need user input each time
			
			if(userInput > generatedNumber) {
				System.out.println("decrease your guess");
			} else if(userInput < generatedNumber) {
				System.out.println("increase your guess");
			} else {
				System.out.println("you got it");
				break;
			}
		}
		scanner.close();
		
		/*
		final boolean isChecked = true;  // final keyword indicates that the value of this variable cannot be changed again and the value is final
		
		while(isChecked) {
			System.out.println("This is an infinite loop");
		}
		
		int a = 5;
		*/
	}

}
