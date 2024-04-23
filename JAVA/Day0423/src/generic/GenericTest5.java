package generic;

class Animal {

}

class Tiger extends Animal {

}

public class GenericTest5 {

	public static void main(String[] args) {
		Animal ani = new Animal();
		Tiger tiger = new Tiger();
		noname(ani);
	}

	// T라는 파라미터로는 Animal 클래스의 객체를 포함한 자식클래스의 객체들만 허용함
	static <T extends Animal> void noname(T t) {
		System.out.println(t);
	}
}
