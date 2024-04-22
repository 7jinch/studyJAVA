import java.util.Scanner;

public class SwitchTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 : ");
		int score = sc.nextInt();
		String medal = switch(score) {
		case 1 -> "금메달";
		case 2 -> "은메달";
		case 3 -> "동메달";
		default -> "참가상";
		};
		System.out.println(medal);
	}

}
