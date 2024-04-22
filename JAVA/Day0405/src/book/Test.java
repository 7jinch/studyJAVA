package book;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean iterator = true;
		String goOn = "";
		double result = 0;
		
		System.out.println("---------------시작---------------");
		
		while(iterator) {
			System.out.print("정수 입력               : ");
			int num1 = sc.nextInt();
			
			System.out.print("연산자 입력(+, -, *, /) : ");
			String operator = sc.next();
			sc.nextLine();
			
			System.out.print("정수 입력               : ");
			int num2 = sc.nextInt();
			
			System.out.println("                          = ");
			
			switch(operator) {
			case "+" -> result = num1 + num2;
			case "-" -> result = num1 - num2;
			case "*" -> result = num1 * num2;
			case "/" -> result = num1 / num2;
			}
			
			System.out.println("결과                    : " + result);
			System.out.print("그만 하려면 N을 입력하세요 : ");
			goOn = sc.next();
			
			if(goOn.equals("N") || goOn.equals("n") || goOn.equals("NO") || goOn.equals("no")) {
				iterator = false;
			}
		}
		System.out.println("---------------종료---------------");
	}

}
