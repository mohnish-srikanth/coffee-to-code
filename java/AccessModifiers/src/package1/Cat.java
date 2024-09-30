package package1;

public class Cat {

	public static void main(String[] args) {
		
		Cat myCat = new Cat();
		myCat.publicMethod();
		myCat.protectedMethod();
		myCat.defaultMethod();
		myCat.privateMethod();
		
	}
	
	private void privateMethod() {
		System.out.println("this is the private modifier");
	}
	
	void defaultMethod() {
		System.out.println("this is the default modifier");
	}
	
	protected void protectedMethod() {
		System.out.println("this is the protected modifier");
	}
	
	public void publicMethod() {
		System.out.println("this is the public method");
	}

}
