package poly;

public class Test {

	public static void main(String[] args) {
		Human kim = new Human(29, "김상형");
		Student lee = new Student(42, "이승우", 100, "경영");
		Soldier kang = new Soldier(45, "강감찬", 12345);
		Theif hong = new Theif(15, "홍길동", "부자", 2);
		
		introduce(kim);
		introduce(lee);
		introduce(kang);
		introduce(hong);
	}
	
	static void introduce(Human who) {
		who.intro();
	}

}
