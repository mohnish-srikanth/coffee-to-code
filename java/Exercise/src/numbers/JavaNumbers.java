package numbers;

public class JavaNumbers {

	public static void main(String[] args) {
		
		System.out.println("-------------------OCTAL NUMBERS-------------------");
		// octal numbers
		// octal numbers 0 to 7
		int octalNumber1 = 015; // this will be stored as 13 in decimal
		int octalNumber2 = 0104; // this will be stored as 68 in decimal
		int sumOctalNumbers = octalNumber1 + octalNumber2; //81 stored in decimal
		
		System.out.println("octalNumber1 in decimal: " + octalNumber1);
		System.out.println("octalNumber2 in decimal: " + octalNumber2);
		System.out.println("sum of octal numbers in decimal: " + sumOctalNumbers);
		System.out.println("sum of octal numbers in octal: " + Integer.toOctalString(sumOctalNumbers));
		
		System.out.println("-------------------HEXADECIMAL NUMBERS-------------------");
		// hexadecimal
		// hex numbers have 0-9 and A-F
		int hexNumber1 = 0x1B0; // this will be stored as 432 in decimal
		int hexNumber2 = 0x2F; // this will be stored as 47 in decimal
		int sumHexNumbers = hexNumber1 + hexNumber2; // this will store 479 in decimal
		
		System.out.println("hexNumber1 in decimal: " + hexNumber1);
		System.out.println("hexNumber2 in decimal: " + hexNumber2);
		System.out.println("sum of hex numbers in decimal: " + sumHexNumbers);
		System.out.println("sum of hex numbers in octal: " + Integer.toHexString(sumHexNumbers));
		
		System.out.println("-------------------BINARY NUMBERS-------------------");
		// binary 
		int binaryNumber1 = 0b1001; // this will be stored as 9 in decimal
		int binaryNumber2 = 0b1011; // this will be stored as 11 in decimal
		int sumBinaryNumbers = binaryNumber1 + binaryNumber2; // this will store 20 in decimal
		
		System.out.println("binaryNumber1 in decimal: " + binaryNumber1);
		System.out.println("binaryNumber2 in decimal: " + binaryNumber2);
		System.out.println("sum of binary numbers in decimal: " + sumBinaryNumbers);
		System.out.println("sum of binary numbers in octal: " + Integer.toBinaryString(sumBinaryNumbers));
		
	}

}
