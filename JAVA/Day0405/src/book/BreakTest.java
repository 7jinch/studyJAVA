package book;

public class BreakTest {

	public static void main(String[] args) {
		for(int i = 0; i <= 50; i++) {
			if(i == 23) {
				continue;
			}
			System.out.println(i);
		}
	}

}
