import java.util.Scanner;

public class Project2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("이름 : ");
		String name = scanner.nextLine();
		
		System.out.print("나이 : ");
		int age = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("키 : ");
		double height = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.print("이름은 " + name + "이고 나이는 " + age + "세, 키는 " + height + "cm 입니다.");

	}

}
