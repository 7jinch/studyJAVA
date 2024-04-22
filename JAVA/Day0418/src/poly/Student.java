package poly;

public class Student extends Human {
	int stNum;
	String major;

	public Student(int age, String name, int stNum, String major) {
		super(age, name);
		this.stNum = stNum;
		this.major = major;
	}

	public void study() {
		System.out.printf("%s 공부합니다.%n", name);
	}

	@Override
	public void intro() {
		super.intro();
		System.out.printf("%s학과 %d학번 %s입니다.%n", major, stNum, name);
	}

}