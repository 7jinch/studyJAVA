package generic;

public class GenericTest4 {

	public static void main(String[] args) {
		System.out.println(max(2,2));
	}

	static <T extends Comparable<T>> T max(T t1, T t2) {
		if (t1.compareTo(t2) > 0) {
			return t1;
		} else {
			return t2;
		}
	}
}
