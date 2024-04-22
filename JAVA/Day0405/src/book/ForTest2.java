package book;

public class ForTest2 {

	public static void main(String[] args) {
		int sumO = 0;
		int sumE = 0;
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) { // 짝수라면
				sumE += i;
				continue;
			}
			// 홀수라면
			sumO += i;
		}
		
		System.out.println("홀수의 합 : " + sumO);
		System.out.println("짝수의 합 : " + sumE);
	}

}
