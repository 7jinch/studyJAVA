import java.util.ArrayList;

public class ArrayTest1 {

	public static void main(String[] args) {
		// 동적 배열 생성
		ArrayList<Integer> arrNum = new ArrayList<>();

		// 동적 배열에 값 추가
		for (int i = 0; i < 10; i++) arrNum.add(i);

		// for each문으로 출력해보기
		for (int item : arrNum) System.out.println(item);

		// 특정 인덱스의 값 출력해보기
		System.out.println(arrNum.get(3));
	}

}
