import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("이름: ");
		String name = sc.next();
		System.out.println(name);
	}
}
