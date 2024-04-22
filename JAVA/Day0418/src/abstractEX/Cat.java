package abstractEX;

// final: 상속받으면서 더이상 자식 클래스에게 상속을 허용하지 않음
public final class Cat extends Animal {
	public void attack() {
		System.out.println("Cat 공격한다");
	}
	
	@Override
	public void move() {
		System.out.println("Cat 움직인다");
	}
}