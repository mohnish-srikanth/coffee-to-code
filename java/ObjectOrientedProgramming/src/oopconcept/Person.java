package oopconcept;

public class Person {
	
	private String name;
	private double weight;
	int age;
	int salary;
	
	// this is a 2 parameter constructor
	public Person(String name, double weight) {
		
		this.name = name;
		this.weight = weight;
		
	}
	
	// this is a 4 parameter constructor
	public Person(String name, double weight, int age, int salary) {
		
		this.name = name;
		this.weight = weight;
		this.age = age;
		this.salary = salary;
		
	}
	
	public void wakeUp() {
		System.out.println(this.name + " woke up");
	}
	
	public void eat() {
		System.out.println(this.name + " had breakfast");
		this.weight += 1;
	}
	
	public void doExercise() {
		System.out.println(this.name + " exercised");
		this.weight -= 1;
	}
	
	public void showWeight() {
		System.out.println("Current weight of " + this.name + " is " + this.weight + " kg.");
	}
	
	public String toString() {
		return "Name: " + this.name + " Age: " + this.age + " Weight: " + this.weight + " Salary: $" + this.salary;
	}
	
}