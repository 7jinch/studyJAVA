import java.util.Scanner;

public class Infinite {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int grade = 0;

		for (;;) {
			System.out.print("몇학년인가요(1~6): ");
			grade = sc.nextInt();

			if (grade >= 1 && grade <= 6) {
				break;
			}
			System.out.println("다시 입력하세요.");
		}
		
		System.out.println(grade + "학년입니다.");
		sc.close();
	}

}
