package inheritance;

public class Animals {
	
	public void eat(String animals) {
		System.out.println(animals + " eat food");
	}
	
	protected void drink(String animals) {
		System.out.println(animals + " drink water");
	}
	
	void move(String animals) {
		System.out.println(animals + " move");
	}
	
	public void breath(String animals) {
		System.out.println(animals + " breathe");
	}
	
}
