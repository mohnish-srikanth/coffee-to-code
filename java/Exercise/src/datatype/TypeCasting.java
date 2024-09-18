package datatype;

public class TypeCasting {

	public static void main(String[] args) {
		
		int a = 124;
		long b = a; // no need for typecasting
		double d = b; // no need for typecasting
		
		System.out.println("int value: " + a);
		System.out.println("long value: " + b);
		System.out.println("double value: " + d);
		
		double s = 86.02;
		long m = (long)s; // this needs typecasting and it is done
		byte c =(byte)m; // this needs typecasting and it is done
		
		System.out.println("----------------------");
		System.out.println("double value: " + s);
		System.out.println("long value: " + m);
		System.out.println("byte value: " + c);
	}

}
