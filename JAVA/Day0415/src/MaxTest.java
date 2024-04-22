
public class MaxTest {

	public static void main(String[] args) {
		// 두 수 중 큰 수 구하기
		System.out.printf("[9, 7] 중 큰 수는 %d임", getMax(9, 7));
	}
	
	static int getMax(int ...numbers) {
		int max = 0;
		for(int number : numbers) {
			if(max < number) max = number;
		}
		return max;
	}
}
