package poly;

public class AnimalTest {

	public static void main(String[] args) {
		// 좌우 타입이 같은 경우
		Animal animal = new Animal();
		animal.move();

		// 부모 타입으로 선언하고 자식 객체 대입은 가능
		// 자식 클래스는 부모 클래스를 상속받았기 때문에
		// 자식 클래스로 생성한 객체는 부모 클래스의 필드와 메서드로 생성할 수 있음
		Animal dog = new Dog();
		dog.move();
//		dog.bark(); // 선언된 부모 클래스의 메서드에만 접근 가능함

		// 자식 타입으로 선언하고 부모 객체 대입은 불가능
		// 부모 클래스로는 자식 클래스에 있는 것을 생성하지 못 할 수도 있어서 막음
//		Bird bird = new Animal();
	}

}
