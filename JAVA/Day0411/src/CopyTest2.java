
public class CopyTest2 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		int[] arr2 = arr;
		
		System.out.printf("%d%n", arr[1]);
		System.out.printf("%d%n", arr2[1]);
		
		arr2[1] = 1000;
		System.out.printf("%d%n", arr[1]);
		System.out.printf("%d%n", arr2[1]);
	}

}
