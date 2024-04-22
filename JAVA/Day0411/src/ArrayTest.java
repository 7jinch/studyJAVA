import java.util.ArrayList;
import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("몇 명: ");
		int students = sc.nextInt();
		ArrayList<Integer> studentsArr = new ArrayList<>(students);

		for (int i = 0; i < students; i++) {
			System.out.print((i + 1) + "번 학생의 성적 입력: ");
			int score = sc.nextInt();
			studentsArr.add(score);
		}

		System.out.println("--------------------------------------------------------");

		int j = 0;
		while (true) {
			if (j == students)
				break;
			System.out.println((j + 1) + "번 학생의 성적: " + studentsArr.get(j));
			j++;
		}

	}

}
