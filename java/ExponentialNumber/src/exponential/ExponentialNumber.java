package exponential;

import java.util.Scanner;

public class ExponentialNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer base number: ");
		int base = scanner.nextInt();
		System.out.println("Enter the exponent: ");
		int exponent = scanner.nextInt();
		for (int i = 0; i <= exponent; i++) {
			System.out.println(base + " to the power " + i + " is: " + pow(base, i));
		}
		scanner.close();

	}
	
	public static int pow(int num, int pow) {
		return (int) Math.pow(num, pow);
	}

}
