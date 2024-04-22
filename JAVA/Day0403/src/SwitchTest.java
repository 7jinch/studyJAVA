import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("1이다");
			break;
		case 2:
			System.out.println("2이다");
			break;
		default:
			System.out.println("?");
		}

		sc.close();

	}

}
