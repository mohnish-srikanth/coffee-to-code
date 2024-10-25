package stringclassexample;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UsefulMethodsOfString {

	public static void main(String[] args) {
		
		String s1 = "Java developers";
		String s2 = "Hello";
		String s3 = "hello";
		
		// charAt()
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(4));
		// System.out.println(s1.charAt(25)); // this will throw string index out of bounds error
		System.out.println(s1.charAt(s1.length() - 1)); // this will return the last char of the string
		
		// indexOf()
		System.out.println(s1.indexOf("p")); // this will return the index of the char entered in the param
		System.out.println(s1.indexOf("v", 5)); // first v after the 5th index
		System.out.println(s1.indexOf("lop")); // this returns the index from where lop starts
		System.out.println(s1.indexOf("lop", 12)); // this returns the index from where lop starts after the 12th index and this will return -1 as it does not exist
		// this method will not throw an index out of bounds error
		
		// Substring()
		System.out.println(s1.substring(5)); // developers // prints substring from the 5th index
		System.out.println(s1.substring(5, 12)); // develop // lower and upper limit params
		
		
		// equalsIgnoreCase()
		System.out.println(s2.equalsIgnoreCase(s3)); // true as this ignores the case while comparing 
		
		// startsWith()
		System.out.println(s2.startsWith("H")); // true
		System.out.println(s2.startsWith("h")); // false
		System.out.println(s2.startsWith("h".toUpperCase())); // true
		System.out.println(s2.startsWith("Hel")); // true
		
		// endsWith()
		System.out.println(s1.endsWith("s")); // true
		System.out.println(s1.endsWith("ers")); // true
		
		// contains()
		System.out.println(s1.contains("developers")); // true
		System.out.println(s1.contains("J".toLowerCase())); // false
		
		// replace()
		System.out.println(s1.replace(" ", "-")); // Java-developers
		
		// trim()
		System.out.println("   Hello   ".trim()); // Hello // removes spaces only in the beginning and the end
		
		
		/*
		String str1 = "Hello Java Devs";
		String str2 = "Java is fun";
		String[] str3;
		
		System.out.println("str1 = " + str1);
		System.out.println("length of str1 = " + str1.length()); // 15
		System.out.println("first char of str1 = " + str1.charAt(0)); // H
		System.out.println("is str1 empty = " + str1.isEmpty()); // false
		System.out.println("substring = " + str1.substring(6)); // Java Devs // here we pass 6 as it starts the substring from that index
		System.out.println("str1 is equal to str2 = " + str1.equals(str2)); // false
		System.out.println("str1 + str2 = " + str1.concat(str2)); // Hello Java DevsJava is fun
		System.out.println("str1 in lower case = " + str1.toLowerCase());
		System.out.println("str1 in upper case = " + str1.toUpperCase());
		System.out.println("replace l with L = " + str1.replace("l", "L"));
		str3 = str1.split(" ");
		System.out.println(Arrays.toString(str3)); // [Hello, Java, Devs]
		*/
	}

}
