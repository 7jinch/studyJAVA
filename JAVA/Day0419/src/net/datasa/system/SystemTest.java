package net.datasa.system;

public class SystemTest {
	public static void main(String[] args) {
		int i = 123;
		double d = 3.14;
		String str = "문자열";
		
		System.err.println("i: " + i);
		System.err.println("d: " + d);
		System.err.println("str: " + str);

		System.err.printf("i: %d, d: %.2f, str: %s%n", i, d, str);
	}
}
