import java.util.HashMap;

public class HashMapTest1 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();

		// 값 추가: put(key, value)
		map.put("오징어 땅콩", 2500);
		map.put("죠리퐁", 1900);
		map.put("핫브레이크", 450);
		map.put("빼빼로", 900);

		// 값 찾기: get(key)
		String myStack = "빼빼로";
		int price = map.get(myStack);
		System.out.printf("%s의 가격은 %d원 입니다.%n", myStack, price);
	}

}
