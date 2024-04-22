
public class OperatorTest7 {

	public static void main(String[] args) {
		int max = 14;
		int left = (int) (max / 2);
		int right = (int) (max / 2);
		boolean condition = false;

		for (int i = 0; i < max; i++) {
			for (int j = 0; j < max; j++) {
				if (j < max - left) {
					if(j > max - right - 1) {
						System.out.print("*");
						continue;
					}
					if(j < max - left -1) {
						System.out.print(" ");
						continue;
					}
				}
			}

			if (!condition) {
				if (left <= 1) {
					condition = true;
				}
				left--;
				right++;
			} else if (condition) {
				left++;
				right--;
			}

			System.out.println();
		}
	}

}
