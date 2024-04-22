
public class Soldier extends Human {
	int milNum;

	public Soldier(int age, String name, int milNum) {
		super(age, name);
		this.milNum = milNum;
	}
	
	void fight() {
		System.out.println("싸움");
	}

}
