
public class CarTest {

	public static void main(String[] args) {
		Car korando = new Car("코란도", true, 2000);
		System.out.printf("%d년식 %s", korando.year, korando.name);
		korando.run();
		korando.stop();
		
		Car tico = new Car("티코", true, 2005);
		System.out.printf("%d년식 %s", tico.year, tico.name);
		tico.run();
		tico.stop();

	}

}
