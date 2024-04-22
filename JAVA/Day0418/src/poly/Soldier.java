package poly;

public class Soldier extends Human {
	int milNum;

	public Soldier(int age, String name, int milNum) {
		super(age, name);
		this.milNum = milNum;
	}
	
	void fight() {
		System.out.println("싸움");
	}
	
	@Override
	public void intro() {
		System.out.println("충성. " + milNum + "다.");
	}

}
