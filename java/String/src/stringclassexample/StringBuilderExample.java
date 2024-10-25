package stringclassexample;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		StringBuilder builder = new StringBuilder("Welcome to");
		builder.append(" Java");
		System.out.println(builder); // Welcome to Java
		System.out.println(builder.length()); // 15
		System.out.println(builder.insert(builder.length(), " World")); // Welcome to Java World
		System.out.println(builder.reverse()); // dlroW avaJ ot emocleW // String class does not have this method
		System.out.println(builder.delete(0, 11)); // ot emocleW // this delete up until the 11th index
		
	}
	
}
