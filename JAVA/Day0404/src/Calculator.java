import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean flag = true;
		System.out.println("계산기 실행");
		
		while (flag) {
			System.out.print("정수 1 입력: ");
			int num1 = sc.nextInt();
			System.out.print("연산자 입력: ");
			String operatorInput = sc.next();
			System.out.print("정수 2 입력: ");
			int num2 = sc.nextInt();
			if (num2 == 0)
				return;
			switch (operatorInput) {
			case "+:":
				System.out.println(num2 + " = " + (num1 + num2));
				break;
			case "-:":
				System.out.println(num2 + " = " + (num1 - num2));
				break;
			case "*:":
				System.out.println(num2 + " = " + (num1 * num2));
				break;
			case "/:":
				System.out.println(num2 + " = " + (num1 / num2));
				break;
			default:
				System.out.println("?");
			}
			
			System.out.print("계속 하기(Y/N) : ");
			String answer = sc.next();
			if (answer == "N")
				flag = false;
			System.out.println("-------------------------------------------------------------------------------------------");
		}
		sc.close();
	}

}
