import java.util.Scanner;

public class ItSwitchTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 : ");
		int score = sc.nextInt();
		String scoreS = "";
		
		if(score >= 90 && score <= 100) scoreS = "A";
		else if(score >= 80) scoreS = "B";
		else if(score >= 70) scoreS = "C";
		else if(score >= 60) scoreS = "D";
		else scoreS = "F";
		
		System.out.println("성적 : " + scoreS);
	}
}
