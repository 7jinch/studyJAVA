package generic;

public class GenericTest {

	public static void main(String[] args) {
//		IntBox intBox = new IntBox(1234);
//		int ibv = intBox.getValue();
//		System.out.println(ibv);
//
//		DoubleBox doubleBox = new DoubleBox(56.78);
//		Double dbv = doubleBox.getValue();
//		System.out.println(dbv);
//
//		StringBox stringBox = new StringBox("910");
//		String stv = stringBox.getValue();
//		System.out.println(stv);

		// 제네릭
//		ArrayList<Integer> list = new ArrayList<>();
		Box<Integer> intBox =  new Box<Integer>(1234); // ArrayLIst를 생성할 때와 비슷함
		int ibv = intBox.getValue();
		System.out.println(ibv);
		
		Box<Double> doubleBox =  new Box<Double>(56.78);
		Double dbv = doubleBox.getValue();
		System.out.println(dbv);

		Box<String> stringBox =  new Box<String>("910");
		String stv = stringBox.getValue();
		System.out.println(stv);
		
		// 같음?
		boolean b = intBox.getClass() == doubleBox.getClass();
		System.out.println(b); // true
	}
}
