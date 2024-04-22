
public class OperatorTest8 {

	public static void main(String[] args) {
		String str = "";
		int max = 10;
		int half = max / 2;
		int flag = (int) (max / 2);

		for (int i = 0; i < max; i++) {
			for (int j = 0; j < max; j++) {
				if (i < half) {
					System.out.print("j: " + j + " / flag: " + (flag) + " ");
					if (j == (max - flag)) {
						str += "*";
						continue;
					}
					else if (j == flag) {
						str += "*";
						continue;
					}
					str += " ";
					flag--;
					System.out.println();
					continue;
				}
				
			}
			str += "\n";
		}

		System.out.println(str);
	}

}
