import java.util.Scanner;

public class Project3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = scanner.nextInt();
		System.out.println();
		
		System.out.print("num의 값 : " + num);
		System.out.println();

		boolean result = num > 0;
		System.out.print("result의 값 : " + result);
	}

}
