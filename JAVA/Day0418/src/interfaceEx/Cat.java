package interfaceEx;

// final: 상속받으면서 더이상 자식 클래스에게 상속을 허용하지 않음
// implements: 인터페이스에서 클래스의 extends 대신 사용하는 키워드
// 클래스에서는 상속 = 인터페이스에서는 구현
public final class Cat implements Animal {
	public void attack() {
		System.out.println("Cat 공격한다");
	}
	
	@Override
	public void move() {
		System.out.println("Cat 움직인다");
	}
}