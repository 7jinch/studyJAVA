import java.util.Scanner;

public class Method2 {
	static int num;
	static String str;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 1 : ");
		int integer1 = sc.nextInt();
		System.out.print("+, -, *, /, % : ");
		String operator = sc.next();
		System.out.print("정수 2 : ");
		int integer2 = sc.nextInt();

		int result = calculator(integer1, integer2, operator);
		System.out.printf("결과 : %d", result);

	}

	static int calculator(int integer1, int integer2, String operator) {
		switch (operator) {
		case "+": {
			return integer1 + integer2;
		}
		case "-": {
			return integer1 - integer2;
		}
		case "*": {
			return integer1 * integer2;
		}
		case "/": {
			return integer1 / integer2;
		}
		case "%": {
			return integer1 % integer2;
		}
		default:
			return 0;
		}
	}
}
