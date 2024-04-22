
public class Practice3 {

	public static void main(String[] args) {
		int fiveSeven = 1;
		int i = 0;
		
		while (true) {
			if(fiveSeven % 5 == 0 && fiveSeven % 7 == 0) break;
			fiveSeven++;
		}
		System.out.println(fiveSeven);
		
		while(true) {
			i++;
			if(i % 3 == 0) continue;
			if(i == 20) break;
			System.out.print(i + " ");
		}
	}

}
