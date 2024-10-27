package collections;

import java.util.*;

public class ListExamples {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>(); // this is list declaration
		
		List<Integer> list2;
		list2 = new ArrayList<Integer>(); // this is the 2 line declaration of array lists
		
		List<Double> list3 = new ArrayList<Double>();
		
		Collection<Integer> list4 = new ArrayList<Integer>(); // this is also a valid declaration // ArrayList is an interface whose super class is Collection
		
		List list5 = new ArrayList(); // this is a raw reference type for the list // this must be parameterized
		list5.add("Hello java devs");
		String message = (String) list5.get(0); // here we need to type cast as the element added in the array is the of object type
		System.out.println(message);
		
	}

}
