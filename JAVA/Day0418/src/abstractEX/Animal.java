package abstractEX;

// abstract: 객체 생성 불가능하게 함
// sealed: 아무나 상속 못 함
// permits: 지정한 클래스에서만 상속 가능함
public abstract sealed class Animal permits Cat, Dog, Dove {
	abstract void move();
}
