package interfaceEx;

// class 키워드 대신 interface 키워드 사용
// 인터페이스는 클래스를 생성함
public interface Animal {
//	public static final int HEALTH = 100;
	final int HEALTH = 100; // 위에 것을 생략해서 이렇게 쓸 수 있음

//	public abstract void move();
	void move(); // 위에 것을 생략해서 이렇게 쓸 수 있음

	// 일반 메서드 정의
	default void hello() {
		System.out.println("안녕하세요");
	}

	// 정적 메서드 정의
	static void hello2() {
		System.out.println("안녕하세요2");
	}
}
