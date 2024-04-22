package poly;

public class Test2 {

	public static void main(String[] args) {
		// 객체 배열
		Human[] humanArr = { 
				new Human(29, "김상형"),
				new Student(42, "이승우", 100, "경영"),
				new Soldier(45, "강감찬", 12345),
				new Theif(15, "홍길동", "부자", 2)
		};
		
		for(Human item : humanArr) {
			item.intro();
		}
	}

}
