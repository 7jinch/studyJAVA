package generic;

public class Box<Q> {
	Q value;

	public Box(Q value) {
		setValue(value);
	}

	public Q getValue() {
		return value;
	}

	public void setValue(Q value) {
		this.value = value;
	}
}
