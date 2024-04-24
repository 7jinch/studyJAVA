package exception;

public class ExceptionTest3 {

	public static void main(String[] args) {
		System.out.println("시작");

//		ExceptionTest3 et3 = new ExceptionTest3();
//		et3.method();

		method();

		System.out.println("끝");
	}

	static void method() {
		subMethod();
	}

	static void subMethod() {
		int i = 0;
		int a = 3;
		int b = 0;

	}
}
