import java.util.HashMap;

public class HashMapTest2 {

	public static void main(String[] args) {
		HashMap<Integer, Human> map = new HashMap<>();
		
		int[] arrAge = {20, 21, 22};
		String[] arrName = {"홍길동", "김길동", "이길동" };
		
		for(int i = 0; i < arrAge.length; i++) {
			Human human = new Human(arrAge[i], arrName[i]);
			map.put(human.getMyCode(), human);
		}
		
		for(int code : map.keySet()) {
			String name = map.get(code).getName();
			int age = map.get(code).getAge();
			int myCode = map.get(code).getMyCode();
			
			System.out.printf("이름: %s, 나이: %d, 가입코드: %d%n", name, age, myCode);
		}
	}
}
