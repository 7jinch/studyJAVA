
public class RangeTest {

	public static void main(String[] args) {
		Range range = new Range(10, 1);
		
		int sum = 0;
		for(int i = range.getFrom(); i <= range.getTo(); i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
