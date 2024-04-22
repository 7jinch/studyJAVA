
public class StarTest {

	public static void main(String[] args) {
		int max = 10;
		
		for(int i = 0; i < max; i++) {
			for(int j = 0; j < max; j++) {
				if(i == j) System.out.print("1");
				System.out.print("-");
			}
			System.out.println();			
		}
	}
}
