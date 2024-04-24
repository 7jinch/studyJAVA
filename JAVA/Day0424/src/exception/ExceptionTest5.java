package exception;

public class ExceptionTest5 {

	public static void main(String[] args) {
		try {
			calcSum(-10);
		}
		catch (NegativeException e) {
			print(e.getMessage());
		}
	}

	static void calcSum(int to) throws NegativeException {
		if(to < 0) {
			throw new NegativeException("음수는 안 돼요");
		}
		
		int sum = 0;
		
		for(int i = 1; i <= to; i++) {
			sum += i;
		}
		
		print(sum);
	}
	
	static void print(Object message) {
//		for(Object message : messages) {
//			System.out.print(message + " ");
//		}
//		System.out.println();
		System.out.println(message);
	}
}