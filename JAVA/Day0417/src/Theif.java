
public class Theif extends Human{
	String item;
	int star;
	
	public Theif(int age, String name, String item, int star) {
		super(age, name);
		this.item = item;
		this.star = star;
	}
	
	public void steal() {
		System.out.println("훔침");
	}
}
