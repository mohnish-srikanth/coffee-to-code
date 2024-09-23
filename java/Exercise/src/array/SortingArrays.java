package array;

import java.util.Arrays;

public class SortingArrays {

	public static void main(String[] args) {
		
		// sorting double array
		System.out.println("sorting double array");
		double [] array1 = {2.3, 11.0, 4.6, -3.6, 0.8};
		System.out.println(Arrays.toString(array1)); // [2.3, 11.0, 4.6, -3.6, 0.8]
		Arrays.sort(array1);
		System.out.println(Arrays.toString(array1)); // [-3.6, 0.8, 2.3, 4.6, 11.0]
		
		System.out.println("----------------");
		
		System.out.println("sorting int array");
		int[] array2 = {5, 3, 4, 2 ,1};
		System.out.println(Arrays.toString(array2)); // [5, 3, 4, 2, 1]
		Arrays.sort(array2);
		System.out.println(Arrays.toString(array2)); // [1, 2, 3, 4, 5]
		
		System.out.println("----------------");
		
		System.out.println("sorting char array");
		char[] array3 = {'f', 'e', 'a', 'c', 'b', 'A', 'Z'};
		System.out.println(Arrays.toString(array3)); // [f, e, a, c, b, A, Z]
		Arrays.sort(array3);
		System.out.println(Arrays.toString(array3)); // [A, Z, a, b, c, e, f] // upper case comes first due to ASCII values
		
		System.out.println("----------------");
		
		System.out.println("sorting string array");
		String[] array4 = {"cat", "dog", "monkey", "lion", "elephant", "Cow"};
		System.out.println(Arrays.toString(array4)); // [cat, dog, monkey, lion, elephant, Cow]
		Arrays.sort(array4);
		System.out.println(Arrays.toString(array4)); // [Cow, cat, dog, elephant, lion, monkey]
		
		
		System.out.println("----------------");
		
		System.out.println("sorting string number array");
		String[] array5 = {"20", "300", "30", "37", "ant", "Zebra"};
		System.out.println(Arrays.toString(array5)); // [20, 300, 30, 37, ant, Zebra]
		Arrays.sort(array5);
		System.out.println(Arrays.toString(array5)); // [20, 30, 300, 37, Zebra, ant]
		
	}

}
