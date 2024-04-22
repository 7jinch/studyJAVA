
public class Practice {

	public static void main(String[] args) {
		int max = 10;

		for(int i = 0; i < max; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i = 1; i <= max; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i = 1; i < max; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i = 2; i <= max; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
