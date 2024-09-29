package method;

import java.util.Scanner;

public class VarArgs {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("enter some numbers leaving a space between them: ");
			String[] inputNumbers = scanner.nextLine().split(" "); // each input number will be split by a space and added to the array
			sumNumbers(inputNumbers);
			System.out.println("Do you want to continue?");
			char response = scanner.nextLine().charAt(0);
			if(response == 'N')
				System.out.println("Program is terminated");
				break;
		}
		scanner.close();
	}
	
	public static void sumNumbers(String...numbers) {
		
		int sum = 0;
		String enteredNumbers = "";
		
		for(int i = 0; i < numbers.length; i++) {
			sum += Integer.parseInt(numbers[i]);
			
			if(i != numbers.length - 1) {
				enteredNumbers += numbers[i] + "+";
			}
			else {
				enteredNumbers += numbers[i];
			}
		}
		
		System.out.println(enteredNumbers + " = " + sum);
		
	}

}
