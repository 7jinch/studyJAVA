import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수: ");
		int students = sc.nextInt();
		int[] scores = new int[students];
		int sum = 0;
		double avg = 0.0;

		for (int i = 0; i < students; i++) {
			System.out.printf("점수 %d: ", i + 1);
			scores[i] = sc.nextInt();
			sum += scores[i];
		}

		avg = (double) sum / students;

		System.out.printf("총점: %d 평균: %.2f%n", sum, avg);
		System.out.println("수고");
	}

}
