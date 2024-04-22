package interfaceEx;

public final class Dove implements Animal {
	public void fly() {
		System.out.println("Dove 난다");
	}
	
	@Override
	public void move() {
		System.out.println("Dove 움직인다");
	}
}