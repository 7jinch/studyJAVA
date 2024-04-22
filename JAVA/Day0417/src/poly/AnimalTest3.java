package poly;

public class AnimalTest3 {

	public static void main(String[] args) {
		Dog happy = new Dog();
		AnimalTest(happy);
		
		Bird donal = new Bird();
		AnimalTest(donal);
		
		Animal ani = new Animal();
		AnimalTest(ani);
	}
	
	private static void AnimalTest(Animal animal) {
//		Animal animal = new Dog(); // 이게 허용되기 때문에 아래처럼 캐스팅이 가능함
		animal.move();
		
//		if(animal instanceof Dog) {
//			Dog mydog = (Dog)animal;
//			mydog.bark();			
//		} else if(animal instanceof Bird) {
//			Bird muBird = (Bird)animal;
//			muBird.fly();
//		}
		
		// 자바 16 버전에서 새로 생김
		// 바로 캐스팅
		if(animal instanceof Dog mydog) {
			mydog.bark();			
		} else if(animal instanceof Bird myBird) {
			myBird.fly();
		}
	}

}
