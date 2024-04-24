package exception;

public class ExceptionTest2 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");

		int a = 5;
		int b = 0;
		int c = 0;
		int[] arr = {1, 2, 3, 4, 5};
		
		try {
			c = a / b; // 0으로 나눴을 때의 예외 : ArithmeticException
			System.out.println(c);
			arr[5] = 100; // 배열의 인덱스를 초과하는 예외: ArrayIndexOutOfBoundsException
		}
		catch(ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없다.");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스가 배열의 범위를 넘었다.");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("프로그램 종료");
	}

}