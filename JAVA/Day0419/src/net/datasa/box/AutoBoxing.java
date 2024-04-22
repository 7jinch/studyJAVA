package net.datasa.box;

public class AutoBoxing {
	public static void main(String[] args) {
		Integer a = 3; // 자동 박싱(기본형 -> 참조형)
//		Integer a = Integer.valueOf(3);
		Integer b = Integer.valueOf(4);
		
		int c = a + b; // 자동 언박싱(참조형 -> 기본형)
		// int c = Integer.intValue(a + b);
		
		// 자동 박싱
//		System.out.println(Integer.valueOf(c).toString());
		System.out.println(c);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		// NaN
		System.out.println(!Double.isNaN(0.0));
	}
}
