package generic;

public class DoubleBox {
	double value;

	public DoubleBox(double value) {
		setValue(value);
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
}