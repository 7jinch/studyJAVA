package net.datasa.box;

public class BoxingTest {

	public static void main(String[] args) {
		int i = 123;
		Integer wrapInt = new Integer(i);
		String str = wrapInt.toString();

		System.out.println(i + 1);
		System.out.println(str + 1);
		
		
	}
}