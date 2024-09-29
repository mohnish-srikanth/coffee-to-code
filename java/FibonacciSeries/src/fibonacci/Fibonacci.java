package fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the max sequence number: ");
		int inputNumber = scanner.nextInt();
		int fibPrevious = 0, fibonacci = 1, sum = 0;
		for (int i = 1; i <= inputNumber; i++) {
			System.out.print(fibPrevious + " ");
			sum = fibPrevious + fibonacci;
			fibPrevious = fibonacci;
			fibonacci = sum;
		}
		scanner.close();
	}

}
