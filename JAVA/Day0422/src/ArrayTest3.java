import java.util.ArrayList;

public class ArrayTest3 {

	public static void main(String[] args) {
		ArrayList<String> arrName = new ArrayList<>();
		
		// 배열 길이: size()
		System.out.println("현재 배열 길이: "+ arrName.size());
		
		// 배열이 비었는지: isEmpty()
		System.out.println((arrName.isEmpty() ? "배열 비어있음" : "배열 안 비어있음"));
		
		arrName.add("전두환");
		arrName.add("김영삼");
		arrName.add("김대중");
		
		// 동적 배열 중간에 값 삽입하기
		// 특별한 경우가 아니면 사용하지 않기
		arrName.add(1, "노태우");
		
		// 특정 인덱스의 값 삭제: remove()
		arrName.remove(1);
		System.out.println(arrName);
		
		// 특정 인덱스의 값 수정: set()
		arrName.set(1, "짐 레이너");
		System.out.println(arrName);
	}

}
