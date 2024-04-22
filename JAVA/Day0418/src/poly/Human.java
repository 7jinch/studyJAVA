package poly;

public class Human {
	String name;
	int age;

	public Human(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public void intro() {
		System.out.printf("안녕하세요 %d살 %s입니다.%n", age, name);
	}

}
