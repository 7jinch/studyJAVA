import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedTest1 {

	public static void main(String[] args) {
		List<String> list = new LinkedList();
		
		list.add("전두환");
		list.add("김영삼");
		list.add("김대중");
		list.add(1, "노태우");
		
//		for(String item : list) {
//			System.out.println(item);
//		}
		
		// iterator(반복자)
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) { // 다음 요소가 있는지 확인
			System.out.println(iter.next()); // 있으면 해당하는 요소를 가져옴
		}
	}

}
