package generic;

public class GenericTest2 {

	public static void main(String[] args) {
		print(1234);
		print(12.34);
		print("hello world!");
	}

	static <T> void print(T t) {
		System.out.println(t);
	}
	
	// 아래 예시는 안 됨
//	static <T> T abs(T t) {
//		if(t > 0) return t;
//	}
}
