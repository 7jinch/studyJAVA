package net.datasa.tostring;

public class ToStringTest {

	public static void main(String[] args) {
		Human h = new Human(20, "홍길동");
		Human h2 = new Human(21, "김길동");
		String name2 = h2.getName();
		
		System.out.println(h2);
		System.out.println(name2);
	}

}
