package net.datasa.bmi.vo;

public class Member {
	// 멤버 변수
	private int code;
	private String name;
	private double height;
	private double weight;
	private double bmi;
	private String bmiResult;

	static int Registration = 1;

	// 생성자
	public Member(String name,double height, double weight) {
		setName(name);
		setHeight(height);
		setWeight(weight);
		calcBMI();
		setCode();
	}
	
	// 회원코드 설정 메서드
	private void setCode() {
		String temp = Integer.toString((int) (Math.random() * 100000)) + Integer.toString(Registration);
		this.code = Integer.parseInt(temp);
		Registration++;
	}

	// BMI 계산 메서드
	private void calcBMI() {
		double heightToMeter = height * 0.01; // 키를 m 단위로 변환하기

		bmi = weight / (heightToMeter * heightToMeter); // BMI = 몸무게(kg) / 키(m)의 제곱

		if (bmi < 18.5)
			bmiResult = "저체중";
		else if (bmi >= 18.5 && bmi < 23)
			bmiResult = "정상";
		else if (bmi >= 18.5 && bmi < 25)
			bmiResult = "정상";
		else if (bmi >= 25)
			bmiResult = "비만";
		else
			bmiResult = "???";
	}
	
	// 키, 몸무게 수정 메서드
	public void modifyMemberInfo(double height, double weight) {
		setHeight(height);
		setWeight(weight);
		calcBMI();
	}

	// getter, setter
	public int getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getBmi() {
		return bmi;
	}

	public String getBmiResult() {
		return bmiResult;
	}
	
	// toString 메서드 재정의
	@Override
	public String toString() {
		return String.format("회원코드: %d / 이름: %s%n키: %.2f(cm) / 몸무게: %.2f%nBMI: %.2f, BMI 결과: %s%n"
							  , code, name, height, weight, bmi, bmiResult);
	}

}