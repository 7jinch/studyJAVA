
public class CopyTest3 {

	public static void main(String[] args) {
		// 기본형과 참조형의 복사
		int i = 123;
		int i2 = 123;

		int[] arr = new int[] { 1, 2, 3 };
		int[] arr2 = { 1, 2, 3 };
		int[] arr3 = arr; // 얕은 복사: 주소값만 가리킴 ->사본을 변경하면 원본도 변함

		
		System.out.println("arr와 arr2는 " + ((arr == arr2) ? "같음" : "다름"));
		System.out.println("arr와 arr3는 " + ((arr == arr3) ? "같음" : "다름"));
		
		int[] arr4 = null;
		System.out.println("i와 i2는 " + ((i == i2) ? "같음" : "다름"));
		System.out.println(arr4);
	}

}
