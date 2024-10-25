package stringclassexample;

public class StringBufferExample {
	
	public static void main(String[] args) {
		
		StringBuffer buffer = new StringBuffer("Welcome to");
		buffer.append(" Java");
		System.out.println(buffer); // Welcome to Java
		System.out.println(buffer.length()); // 15
		System.out.println(buffer.insert(buffer.length(), " World")); // Welcome to Java World
		System.out.println(buffer.reverse()); // dlroW avaJ ot emocleW // String class does not have this method
		System.out.println(buffer.delete(0, 11)); // ot emocleW // this delete up until the 11th index
		
	}

}
