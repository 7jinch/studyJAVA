import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class LinkedTest2 {

	public static void main(String[] args) {
		List<String> list = new LinkedList();

		list.add("장보고");
		list.add("김유신");
		list.add("강감찬");
		list.add("을지문덕");

		/// 역방향으로 반복문 돌려보기
		ListIterator<String> previousIterator = list.listIterator(list.size()); // 해당 인덱스의 요소를 가리키는 반복자를 반환
		while (previousIterator.hasPrevious()) {
			System.out.println(previousIterator.previous());
		}

		System.out.println("---------------------");

		// 정방향으로 돌려보기
		ListIterator<String> iterator = list.listIterator(); // 리스트의 첫 번째 요소를 가리키는 반복자를 반환
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("---------------------");

		Collections.sort(list); // 가나다 순 정렬
		for (String s : list) {
			System.out.println(s);
		}

		System.out.println("---------------------");

		Collections.reverse(list); // 역방향 정렬
		for (String s : list) {
			System.out.println(s);
		}

		System.out.println("---------------------");

		Collections.shuffle(list); // 무작위 정렬
		for (String s : list) {
			System.out.println(s);
		}
		
		System.out.println("---------------------");
		
		Map<String, Integer> map = new HashMap<>(); // key, value로 값을 저장하는 map 생성
		map.put("빼빼로", 900); // put: key, value로 값 저장
		map.put("빼빼로", 1200); // key 값이 같은데 put을 사용하면 value를 업데이트함
		
		System.out.println(map.get("빼빼로"));  // get: key, value로 값 가져옴
		

	}

}
