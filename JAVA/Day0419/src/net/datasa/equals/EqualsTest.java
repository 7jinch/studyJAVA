package net.datasa.equals;

public class EqualsTest {

	public static void main(String[] args) {
		Human kim = new Human(29, "김상형");
		Human lee = new Human(43, "이승우");

		Human kimCopy = kim;
		Human kim2 = new Human(29, "김상형");

		// 삼항연산자
//		String e = kim == lee ? "같음" : "다름";
//		System.out.println(e);
//
//		e = kim == kimCopy ? "같음" : "다름";
//		System.out.println(e);
//
//		e = kim == kim2 ? "같음" : "다름";
//		System.out.println(e);

//		// equals 연산자
//		String e = kim.equals(lee) ? "같음" : "다름";
//		System.out.println(e);
//
//		e = kim.equals(kimCopy) ? "같음" : "다름";
//		System.out.println(e);
//
//		e = kim.equals(kim2) ? "같음" : "다름";
//		System.out.println(e);
		
		String str1 = new String("홍길동");
		String str2 = new String("홍길동");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
	}

}
