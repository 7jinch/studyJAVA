package interfaceEx;

public class Test {

	public static void main(String[] args) {
		Animal[] animalArr = {
//				new Animal(),
				new Cat(),
				new Dog(),
				new Dove()
		};
		
		for(Animal animal : animalArr) {
			animal.move();
			animal.hello();
		}

		Animal.hello2();
		
	}
}
