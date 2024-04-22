package abstractEX;

// non-sealed abstract: 구현 미루기
public non-sealed abstract class Dog extends Animal {
	public void bark() {
		System.out.println("Dog 짖는다");
	}
	
	@Override
	public void move() {
		System.out.println("Dog 움직인다");
	}
}