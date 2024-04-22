
public class ArrayTest {

	public static void main(String[] args) {
		int score = 5;
		String[] msg = { "", "최고", "우수", "보통", "부진", "왜 삼?" };
		int[] rank = { 5, 4, 4, 3, 3, 3, 2, 2, 1, 1 };
		
		System.out.println(msg[rank[score]]);
	}

}
