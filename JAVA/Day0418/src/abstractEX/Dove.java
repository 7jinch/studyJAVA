package abstractEX;

public final class Dove extends Animal {
	public void fly() {
		System.out.println("Dove 난다");
	}
	
	@Override
	public void move() {
		System.out.println("Dove 움직인다");
	}
}