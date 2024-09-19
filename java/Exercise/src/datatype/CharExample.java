package datatype;

public class CharExample {

	public static void main(String[] args) {
		
		// char datatype 
		char c1 = 'H'; // 72 in ASCII
		char c2 = '5'; // 53 in ASCII
		
		System.out.println("c1: " + c1);
		System.out.println("is c1 a letter? " + Character.isLetter(c1));
		System.out.println("is c1 a digit? " + Character.isDigit(c1));
		
		System.out.println("c1: " + c2);
		System.out.println("is c1 a letter? " + Character.isLetter(c2));
		System.out.println("is c1 a digit? " + Character.isDigit(c2));
		
		char letter1 = 67; //C
		int num1 = letter1; // 67 + 3 = 70 -> F
		char letter2 = (char) num1; // F
		
		System.out.println("letter2 is " + letter2);
		
		char letter3 = 70; // F
		char letter4 = letter3--; // E
		boolean check1 = letter4 == 'E'; // F != E
		boolean check2 = letter3 > 'D'; // 69 -> 68 E > D true
		
		System.out.println(check1); // false
		System.out.println(check2);
		
	}

}
