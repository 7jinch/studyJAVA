
public class Method3 {

	public static void main(String[] args) {
		int line = 10;
		String star = makeStar(line);
		System.out.println(star);
	}

	static String makeStar(int line) {
		String star = "";

		for (int i = 0; i < line; i++) {
			for (int j = 0; j < line; j++) {
				star += "*";
			}
			star += "\n";
		}
		return star;
	}
}
