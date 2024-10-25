package stringclassexample;

public class StringExample {

	public static void main(String[] args) {

		// string using the literal
		String stringLiteral1 = "Hello";
		String stringLiteral2 = "World";
		
		System.out.println(stringLiteral1 + " " + stringLiteral2);
		
		// string object
		String stringObject1 = new String("Hello");
		String stringObject2 = new String("World");
		
		System.out.println(stringObject1 + " " + stringObject2);
		
		String concatenatedStringLiteral = stringLiteral1 + " " + stringLiteral2;
		String concatenatedStringObject = stringObject1 + " " + stringObject2;
		
		System.out.println(concatenatedStringLiteral);
		System.out.println(concatenatedStringObject);
		
		System.out.println(4 + 5 + "6"); // 96
		System.out.println(4 + "5" + 6); // 456
		System.out.println("4" + 5 + 6); // 456
	}

}
