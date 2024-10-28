package collections;

import java.util.ArrayList;

import javax.xml.stream.events.Namespace;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<Integer> ages = new ArrayList<Integer>();
		ages.add(25);
		ages.add(30);
		ages.add(20);
		
		System.out.println("ages: " + ages);
		
		ArrayList<Object> mixList = new ArrayList<Object>();
		mixList.add("Java");
		mixList.add(20);
		mixList.add(2.53);
		mixList.add(true);
		
		System.out.println("mixList: " + mixList);
		
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("lion");
		animals.add("cat");
		animals.add(2, "dog"); // index and the element to be added
		animals.add(1, "cow"); // inserts cow in the second position and shifts the rest to the right
		
		System.out.println("animals: " + animals);
		
		animals.remove(2); // removes element in index 2 - cat
		System.out.println("animals: " + animals);
		
		animals.remove("lion"); // removes element based on name
		System.out.println("animals: " + animals);
		
		animals.set(1, "ant"); // this takes the index number as the first param and replaces with the second param
		System.out.println("animals: " + animals);
		
		ArrayList<String> cars = new ArrayList<String>();
		System.out.println("size of cars array: " + cars.size()); // 0 as it is empty
		System.out.println("is cars array empty: " + cars.isEmpty()); // true as it is empty
		
		cars.add("Mercedes");
		cars.add("Ferrari");
		cars.add("BMW");
		cars.add("Ford");
		
		System.out.println("size of cars array: " + cars.size()); // 4
		System.out.println("is cars array empty: " + cars.isEmpty()); // false
		System.out.println("cars contains BMW: " + cars.contains("BMW")); // true
		System.out.println("cars contains tata: " + cars.contains("tata")); // false
		
		cars.clear(); // delete all elements of the array at once
		System.out.println("size of cars array: " + cars.size()); // 0
		System.out.println("is cars array empty: " + cars.isEmpty()); // true
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Andy");
		names.add("Joe");
		names.add("David");
		
		ArrayList<Object> names2 = new ArrayList<Object>();
		names2.add("Andy");
		names2.add("Joe");
		names2.add("David");
		
		System.out.println("names == names2: " + names.equals(names2)); // true
		// this function also compares the order of the elements
		// this function returned true even though one is of string type and other is of object type
		
	}

}
