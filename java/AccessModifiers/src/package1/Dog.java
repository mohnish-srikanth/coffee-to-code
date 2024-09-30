package package1;

public class Dog {
	
	public static void main(String[] args) {
		
		Cat myCat = new Cat();
		myCat.publicMethod();
		myCat.protectedMethod();
		myCat.defaultMethod();
		// myCat.privateMethod(); // private method cannot be accessed from here
	}

}
