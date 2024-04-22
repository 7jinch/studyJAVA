
public class Car {
	String name;
	boolean gasoline;
	int year;
	
	public Car() {
	}
	
	public Car(String name, boolean gasoline, int year) {
		this.name = name;
		this.gasoline = gasoline;
		this.year = year;
	}
	
	public Car(String name) {
		this.name = name;
	}

	void run() {
		if (gasoline) {
			System.out.println(name + " 부릉부릉");
		} else {
			System.out.println(name + " 덜컹덜컬");
		}
	}

	void stop() {
		System.out.println(name + " 끼이익");
	}
}
