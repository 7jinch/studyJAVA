
public class Test1 {

	public static void main(String[] args) {
		Human kim = new Human(29, "김상형");
		kim.intro();
		
		Student lee = new Student(42, "이승우", 100, "경영학과");
		lee.intro();
		lee.study();
		
		Graduate park = new Graduate(35, "박대희", 200, "전산학과", "웹보안");
		park.intro();
		park.study();
		park.research();
	}

}
