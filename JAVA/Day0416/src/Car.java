
public class Car {
	// private 키워드를 붙이면 메서드(getter, setter)로만 접근할 수 있음
	private String name;
	private boolean gasoline;
	private int year;
	private int myCarNum;
	final String ENGINE;

	// static 키워드를 붙이면 클래스에 귀속되서 호출할 때도 클래스명으로 하면 됨
	// 메서드도 마찬가지로 클래스명.메서드명 <- 이렇게 접근할 수 있음
	static int carNum;

	// static 변수를 초기화할 때는 보통 이렇게 함
	static {
		carNum = 1;
	}

	public Car() {
		ENGINE = name + " - ENGINE";
	}

	public Car(String name, boolean gasoline, int year) {
		setName(name);
		setGasoline(gasoline);
		setYear(year);
		setMyCarNum(carNum++);
		ENGINE = name + " - ENGINE";
	}

	public int getMyCarNum() {
		return myCarNum;
	}

	public void setMyCarNum(int myCarNum) {
		this.myCarNum = myCarNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isGasoline() {
		return gasoline;
	}

	public void setGasoline(boolean gasoline) {
		this.gasoline = gasoline;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year >= 1900 && year <= 2025) {
			this.year = year;
		}
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
	
	void printNum() {
		System.out.printf("%s 일련번호: %d%n",name, myCarNum);
	}
}