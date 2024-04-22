package net.datasa.tostring;

public class Human {
	private String name;
	private int age;

	public Human(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public void intro() {
		System.out.printf("안녕하세요 %d살 %s입니다.%n", age, name);
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public String toString() {
		return "이름: " + name + ", 나이: " + age;
	}

}
