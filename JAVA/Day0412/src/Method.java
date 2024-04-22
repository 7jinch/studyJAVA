
public class Method {

	public static void main(String[] args) {
		// 1 ~ 10까지 더하기
		int i = sumTotal(1, 10);
		System.out.println("1 ~ 10까지 더하기: " + i);

		// 15 ~ 100까지 더하기
		i = sumTotal(15, 100);
		System.out.println("15 ~ 100까지 더하기: " + i);

		// 34 ~ 254까지 더하기
		i = sumTotal(34, 254);
		System.out.println("34 ~ 254까지 더하기: " + i);
	}

	static int sumTotal(int integer1, int integer2) {
		int sum = 0;

		for (int i = integer1; i <= integer2; i++) {
			sum += i;
		}

		return sum;
	}

}
