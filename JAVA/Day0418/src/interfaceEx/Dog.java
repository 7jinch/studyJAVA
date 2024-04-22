package interfaceEx;

public class Dog implements Animal {
	public void bark() {
		System.out.println("Dog 짖는다");
	}
	
	@Override
	public void move() {
		System.out.println("Dog 움직인다");
	}
}