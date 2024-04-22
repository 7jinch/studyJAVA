import java.util.ArrayList;

public class ArrayTest2 {

	public static void main(String[] args) {
		ArrayList<Integer> arrNum = new ArrayList<>();

		// 난수 생성해보기
		int num = 0;
		for (int i = 0; i < 30; i++) {
			num = (int)(Math.random() * 10);
			arrNum.add(num);
		}

		for (int item : arrNum) System.out.println(item);
	}

}
