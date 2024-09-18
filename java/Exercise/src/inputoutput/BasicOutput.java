package inputoutput;

public class BasicOutput {

	public static void main(String[] args) {
		
		System.out.println("Java programming is fun");
		System.out.println("Java programming" + " is fun");
		
		System.out.print("Java ");
		System.out.print("programming ");
		System.out.print("is ");
		System.out.print("fun");
		
		int a = 4;
		int b = 5;
		int c = a + b;
		
		System.out.println();
		System.out.printf("%d + %d = %d%n", a, b, c);
		
		System.out.printf("%S%n", "hello");
		System.out.printf("%s", "hello");
		
	}

}
