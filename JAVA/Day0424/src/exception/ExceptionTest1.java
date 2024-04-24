package exception;

public class ExceptionTest1 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");

		try {
			// 예외가 발생할 수 있는 메서드이기 때문에 try catch로 감싸지 않으면 사용할 수 없음
			Thread.sleep(3000);
			System.out.println("정상 동작");
		} catch (InterruptedException e) {
			System.out.println("예외 발생: " + e);
		}
		
		System.out.println("프로그램 끝");
	}
}