package inheritance;

public class TestInheritance {

	public static void main(String[] args) {

		dog dog = new dog();
		dog.breath("dog");
		dog.eat("dog");
		dog.move("dog");
		// all these methods were inherited to the dog class from the animal class
		dog.bark();
		// this is dogs own method
		
		System.out.println("----------------");
		
		Bird bird = new Bird();
		bird.breath("bird");
		bird.eat("bird");
		bird.move("bird");
		// all these methods were inherited to the bird class from the animal class
		bird.fly();
		// this is birds own method
		
	}

}
