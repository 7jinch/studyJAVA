
public class Gugudan {

	public static void main(String[] args) {
//		for (int i = 2; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//				System.out.print(i + " x " + j + " = " + (i * j) + "\t");
//			}
//			System.out.println();
//		}
		
		int max = 10;
		int lastStar = max;
		
		for(int i = 1; i <= max; i++) {
			for(int j = 1; j <= max; j++) {
				if(i == j) {
					System.out.print("*");
				}
				else if(j == lastStar) {
					System.out.print("*");
					lastStar--;
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}

}
