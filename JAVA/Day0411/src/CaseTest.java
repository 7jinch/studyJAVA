
public class CaseTest {

	public static void main(String[] args) {
		String num = "123";
		
		// 문자열 -> 정수
		int value = Integer.parseInt(num);
		value++;
		System.out.println(value);
		
		// 정수 -> 문자열
		value = 1234;
		num = String.valueOf(value);
		System.out.println(num + 1);
	}

}
