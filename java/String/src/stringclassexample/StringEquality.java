package stringclassexample;

import java.awt.datatransfer.SystemFlavorMap;

public class StringEquality {

	public static void main(String[] args) {

		// 2 comparision operators == and equals()
		
		String s1 = new String("Hello devs");
		String s2 = new String("hello devs");
		String s3 = "Hello devs";
		String s4 = "hello devs";
		String s5 = "Hello " + "devs";
		
		System.out.println("********************* == *********************");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
		System.out.println(s1 == s5);
		System.out.println(s2 == s3);
		System.out.println(s2 == s4);
		System.out.println(s2 == s5);
		System.out.println(s3 == s4);
		System.out.println(s3 == s5);
		System.out.println(s4 == s5);
		
		System.out.println("ID of s1 = " + System.identityHashCode(s1));
		System.out.println("ID of s1 = " + System.identityHashCode(s2));
		System.out.println("ID of s1 = " + System.identityHashCode(s3));
		System.out.println("ID of s1 = " + System.identityHashCode(s4));
		System.out.println("ID of s1 = " + System.identityHashCode(s5));
		
		System.out.println("********************* equals *********************");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s5));
		System.out.println(s2.equals(s3));
		System.out.println(s2.equals(s4));
		System.out.println(s2.equals(s5));
		System.out.println(s3.equals(s4));
		System.out.println(s3.equals(s5));
		System.out.println(s4.equals(s5));
		
	}

}
