
public class CarTest {

	public static void main(String[] args) {
		Car 코란도 = new Car("코란도", true, 2000);
		Car 에쿠스 = new Car("에쿠스", false, 2010);
		Car 티코 = new Car("티코", false, 2020);
		
		코란도.printNum();
		에쿠스.printNum();
		티코.printNum();
		
		System.out.println(코란도.ENGINE);
		
	}

}
