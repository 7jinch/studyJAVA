
public class Range {
	private int from;
	private int to;

	public Range() {
	}

	public Range(int from, int to) {
		int realFrom = from <= to ? from : to;
		int realTo = from <= to ? to : from;
		setFrom(realFrom);
		setTo(realTo);
	}

	// getter
	public int getFrom() {
		return from;
	}

	public int getTo() {
		return to;
	}

	// setter
	public void setFrom(int from) {
		this.from = from;
	}

	public void setTo(int to) {
		this.to = to;
	}
}
