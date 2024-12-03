package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingArrayList {

	public static void main(String[] args) {

		System.out.println("-------------- sorting double list --------------");
		
		// double
		List<Double> list1 = new ArrayList<Double>();
		list1.add(2.3);
		list1.add(11.0);
		list1.add(4.6);
		list1.add(-3.6);
		list1.add(0.8);
		list1.add(12.0);
		
		System.out.println("unsorted list = " + list1); // unsorted list = [2.3, 11.0, 4.6, -3.6, 0.8, 12.0]
		Collections.sort(list1);
		System.out.println("sorted list = " + list1); // sorted list = [-3.6, 0.8, 2.3, 4.6, 11.0, 12.0]
		
		System.out.println("-------------- sorting integer list --------------");
		
		// integer
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(3);
		list2.add(-5);
		list2.add(10);
		list2.add(2);
		list2.add(9);
		
		System.out.println("unsorted list = " + list2); // unsorted list = [1, 3, -5, 10, 2, 9]
		Collections.sort(list2);
		System.out.println("sorted list = " + list2); // sorted list = [-5, 1, 2, 3, 9, 10]
		
		System.out.println("-------------- sorting char list --------------");
		
		// char
		List<Character> list3 = new ArrayList<Character>();
		list3.add('F');
		list3.add('B');
		list3.add('b');
		list3.add('H');
		list3.add('C');
		list3.add('A');
		
		System.out.println("unsorted list = " + list3); // unsorted list = [F, B, b, H, C, A]
		Collections.sort(list3);
		System.out.println("sorted list = " + list3); // sorted list = [A, B, C, F, H, b] // upper case always comes before lower case
		
		System.out.println("-------------- sorting sting list --------------");
		
		// sting 
		List<String> list4 = new ArrayList<String>();
		list4.add("cat");
		list4.add("Dog");
		list4.add("Monkey");
		list4.add("Lion");
		list4.add("elephant");
		list4.add("Cow");
		
		System.out.println("unsorted list = " + list4); // unsorted list = [cat, Dog, Monkey, Lion, elephant, Cow]
		Collections.sort(list4);
		System.out.println("sorted list = " + list4); // sorted list = [Cow, Dog, Lion, Monkey, cat, elephant]
		
	}

}