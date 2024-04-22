import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("랭킹: ");
		int rank = sc.nextInt();
		int winnings = 0;
		switch(rank) {
		case 1:
			System.out.println("최우수상");
			winnings += 1000000;
			break;
		case 2:
		case 3:
			System.out.println("우수상");
			winnings += 500000;
			break;
		case 4:
		case 5:
			System.out.println("장려상");
			winnings += 100000;
			break;
		default:
			System.out.print("참가상");
			break;
		}
		System.out.println("상금 : " + winnings);
	}

}
