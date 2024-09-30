package package2;

import package1.Cat;

public class Bee {

	public static void main(String[] args) {
		
		Cat myCat = new Cat();
		myCat.publicMethod();
		// myCat.protectedMethod(); // protected method cannot be accessed from here
		// myCat.defaultMethod(); // default method cannot be accessed from here
		// myCat.privateMethod(); // private method cannot be accessed from here
	}

}
