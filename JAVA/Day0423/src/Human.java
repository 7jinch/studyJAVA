
public class Human {
	private int age;
	private String name;
	private int myCode;

	static int signinCode = 1000;

	public Human(int age, String name) {
		setAge(age);
		setName(name);
		setMyCode(++signinCode);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMyCode() {
		return myCode;
	}

	public void setMyCode(int myCode) {
		this.myCode = myCode;
	}
	
	@Override
	public String toString() {
		String res = "가입코드: " + myCode + ", 나이: " + age + ", 이름: " + name;
		return res;
	}

}
