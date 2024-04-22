package poly;

public class AnimalTest2 {

	public static void main(String[] args) {
		Animal ani = new Animal();
		Dog dog = new Dog();

		dog.bark();

		// 업캐스팅: 자식 클래스를 부모 클래스로 변환
		Animal up = dog;
//		Animal up = (Animal) dog; // 묵시적으로 캐스팅 됨
		up.move();
//		up.bark(); // 더이상 못 짖음

		// 다운캐스팅: 부모 클래스를 자식 클래스로 변환
		Dog down = (Dog)ani; // 강제 형변환 해 줘야 함
		down.bark();
		down.move();
		// 컴파일에서는 오류가 발생하지 않음
		// 실행하면 오류가 발생함
	}

}
