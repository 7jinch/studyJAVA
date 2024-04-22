import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어: ");
		int korean = sc.nextInt();
		System.out.print("영어: ");
		int english = sc.nextInt();
		System.out.print("수학: ");
		int math = sc.nextInt();
		
		int total = korean + english + math;
		double avg = (double)total / 3;
		
		System.out.println("총점: " + total + " 평균: " + avg);
		sc.close();
	}

}
