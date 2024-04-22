import java.util.Scanner;

public class JavaPractice2 {

	public static void main(String[] args) {
		// 2.BMI(체질량지수) 계산하기
		Scanner sc = new Scanner(System.in);
		System.out.println("2. BMI 계산하기");
		
		// 키, 몸무게 입력받기
		System.out.print("키: ");
		int height = sc.nextInt();
		System.out.print("몸무게: ");
		int weight = sc.nextInt();
		
		// BMI 계산하기
		double heightToM = height * 0.01;
		double BMI = weight / (double)(heightToM * heightToM);

		// 저체중, 정상, 과체중, 비만 여부
		String BMI지수 = "";		
		if(BMI < 18.5) BMI지수 = "저체중";
		else if(BMI >= 18.5 && BMI < 23) BMI지수 = "정상";
		else if(BMI >= 23 && BMI < 25) BMI지수 = "과체중";
		else BMI지수 = "비만";
		
		// 출력하기
		System.out.printf("당신의 BMI 지수: %f(%s)", BMI, BMI지수);
	}

}
