import java.util.ArrayList;
import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
//		int fileSize = 100;
//		int download = 0;
//		
//		boolean complete = false;
//		
//		while(!complete) {
//			download += 1;
//			System.out.println((int)((download / (double)fileSize) * 100) + "% 다운로드...");
//			
//			if(download == fileSize) complete = true;
//		}
//		System.out.println("다운로드 완료");

		Scanner sc = new Scanner(System.in);
		System.out.print("몇 개의 정수를 더하실 건가요? ");
		int length = sc.nextInt();
		
		ArrayList<Integer> arrList = new ArrayList<Integer>(length);
		
		boolean flag = true;
		int inputLength = 0;

		do {
			inputLength++;
			if(inputLength == length) {
				flag = false;
			}
			
			System.out.print("정수를 입력하세요: ");
			int arrElement = sc.nextInt();
			arrList.add(arrElement);

		} while (flag);
		
		int sum = 0;
		for(int i = 0; i < length; i++) {
			sum += arrList.get(i);
		}
		
		System.out.println("합계는 " + sum + "입니다.");
	}

}
