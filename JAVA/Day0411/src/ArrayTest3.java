import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] scores = new int[10];

		scores[0] = 78;
		scores[1] = 85;
		scores[2] = 90;
		scores[3] = 50;
		scores[4] = 100;

		for (int s : scores) {
			if (s == 0) {
				System.out.printf("뭐하는거냐%n");
				s = 1000000000;
				// continue;
			}
			System.out.printf("학생의 점수는 %d임%n", s);
		}
	}

}
