package loops;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		int x = 0;
		while(x < 10) {
			System.out.println(x);
			x++;
		}
		
		String[] animal = {"cat", "dog", "horse", "cow"};
		int i = 0;
		while (i < animal.length) {
			System.out.println(animal[i]);
			i++;
		}
		
		// factorial of a number with while loop
		System.out.println("enter a number: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if (number < 0) {
			System.out.println("invalid number");
		} else if (number == 0 || number == 1) {
			System.out.println("factorial is " + 1);
		} else {
			long result = 1;
			while (number > 0) {
				result *= number;
				number--;
			}
			System.out.println("factorial is " + result);
		}
		scanner.close();
	}
}
