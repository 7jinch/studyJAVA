import java.util.Scanner;

public class JavaPractice1 {

	public static void main(String[] args) {
		// 1. 사각형의 넓이 구하기		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 사각형의 넓이 구하기");
		while (true) {
			// 가로, 세로 입력받기
			System.out.print("가로 길이를 입력하세요: ");
			int width = sc.nextInt();
			System.out.print("세로 길이를 입력하세요: ");
			int height = sc.nextInt();

			// 가로, 세로 길이가 음수면 종료
			if (width < 0 || height < 0) {
				System.out.println("종료");
				break;
			}

			// 정사각형, 직사각형 여부
			Boolean 정사각형인가요 = false;
			if (width == height) // 가로, 세로가 같다면 정사각형
				정사각형인가요 = true;
			
			// 넓이 구하기
			int area = width * height;
			
			// 출력하기
			if (정사각형인가요) {
				System.out.printf("정사각형의 넓이는 %d입니다.", area);
				return;
			}
			System.out.printf("직사각형의 넓이는 %d입니다.", area);
			break;
		}
	}
}