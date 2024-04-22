
public class Method6 {
	public static void main(String[] args) {
		int result = 0;
		
		result = getSum(1, 2);
		System.out.println(result);
		result = getSum(1, 2, 3);
		System.out.println(result);
		result = getSum(1, 2, 3, 4);
		System.out.println(result);
	}

	static int getSum(int... a) {
		int sum = 0;
		for(int i : a) {
			sum += i;
		}
		return sum;
	}

}
