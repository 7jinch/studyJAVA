package exception;

public class ExceptionTest4 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		String name = "빌게이츠";
		name = null;

		try {
			printLength(name);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("프로그램 끝");
	}

	static void printLength(String name) throws NullPointerException {
		if (name == null) {
			throw new NullPointerException("이름이 무효임");
		}
		int nameLength = name.length();
		System.out.println(nameLength);
	}
}
