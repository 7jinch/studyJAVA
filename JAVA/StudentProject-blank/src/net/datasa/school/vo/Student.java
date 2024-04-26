package net.datasa.school.vo;

public class Student {
	// 멤버변수(필드)
	private int stdNum; // 학번
	private String name; // 학생 이름
	private int kor; // 국어 점수
	private int eng; // 영어 점수
	private int math; // 수학 점수
	private int total; // 총점
	private double avg; // 평균 점수
	static int num = 100;// 학번 자동 설정

	// 사용자 정의 생성자
	public Student(String name, int kor, int eng, int math) {
		stdNum = ++num; // 생성자 호출시 학번 부여
		setName(name);
		setKor(kor);
		setEng(eng);
		setMath(math);
		calcTotal(); // 총점 계산
		calcAvg(); // 평균 계산
	}


	// 엑세서(accessor) Getter, Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getKor() {
		return kor;
	}


	public void setKor(int kor) {
		this.kor = kor;
	}


	public int getEng() {
		return eng;
	}


	public void setEng(int eng) {
		this.eng = eng;
	}


	public int getMath() {
		return math;
	}


	public void setMath(int math) {
		this.math = math;
	}


	public int getStdNum() {
		return stdNum;
	}


	public int getTotal() {
		return total;
	}


	public double getAvg() {
		return avg;
	}

	// 3과목의 총점 계산(){
	private void calcTotal() {
		this.total = kor + eng + math;
	}

	// 3과목의 평균 계산
	private void calcAvg() {
		avg = total / 3.0;
	}

	// toString() 재정의
	@Override
	public String toString() {
		return String.format("학번: %d 이름: %s 국어: %d 영어: %d 수학: %d 총점: %d 평균: %.2f",
								stdNum, name, kor, eng, math, total, avg);
	}


	public void modifyScore(int kor, int eng, int math) {
		setKor(kor);
		setEng(eng);
		setMath(math);
	}
}
