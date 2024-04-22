
public class Method5 {

	public static void main(String[] args) {
		// 참조형
		int[] num = { 2, 8, 6 };
		getDouble(num);
		System.out.println("num[1] = " + num[1]);
	}

	private static void getDouble(int[] value) {
		value[1] *= 2;
		System.out.println("value[1] = " + value[1]);
	}

}
