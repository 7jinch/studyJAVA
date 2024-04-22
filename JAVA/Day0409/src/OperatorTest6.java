
public class OperatorTest6 {

	public static void main(String[] args) {
		int num = 100;

		System.out.println(num % 4 == 0 ? (num % 7 == 0 ? "4의 배수이자 7의 배수임" : "4의 배수는 맞은데 7의 배수는 아님") : "4의 배수 아님");
	}

}
