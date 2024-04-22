
public class Graduate extends Student {
	String thesis;

	public Graduate(int age, String name, int stNum, String major, String thesis) {
		super(age, name, stNum, major);
		this.thesis = thesis;
	}
	
	void research() {
		System.out.printf("%s 연구합니다.%n", name);
	}
	
	@Override
	public void intro() {
		super.intro();
		System.out.println("대학원생임");
	}
}
