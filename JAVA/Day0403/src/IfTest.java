import java.util.Scanner;
import java.util.ArrayList;

public class IfTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		ArrayList arrNum = new ArrayList();
//		
//		System.out.print("비교할 정수 개수 : ");
//		int number = sc.nextInt();
//		
//		int biggest = 0;
//		
//		for(int i = 0; i < number; i++) {
//			arrNum.add(sc.nextInt());
//		}
//		
//		for(int i = 0; i < number; i++) {
//			if(biggest < (int)arrNum.get(i)) biggest = (int)arrNum.get(i);
//		}
//
//		System.out.println(arrNum + " 중 가장 큰 수는 " + biggest + "입니다.");
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) System.out.println(num + " : 짝수임");
		else System.out.print("홀수임");
		
		sc.close();

	}

}
