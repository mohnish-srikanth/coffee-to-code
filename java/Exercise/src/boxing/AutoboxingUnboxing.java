package boxing;

public class AutoboxingUnboxing {

	public static void main(String[] args) {

		Double db = 12.8; // autoboxing of double
		double d = db; // auto-unboxing of double
		System.out.println(db + " " + d);
		
		Integer in = 5; // autoboxing of int
		int i = in; // auto-unboxing of int
		System.out.println(in + " " + i);
		
		Character ch = 'b'; // autoboxing of char
		char c = ch; // auto-unboxing of char
		System.out.println(ch + " " + c);
		
	}

}
