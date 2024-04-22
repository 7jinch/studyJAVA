
public class ForTest1 {

	public static void main(String[] args) {
		// 1부터 1씩 증가하면서 더해 나갈 때
		// 어떤 정수까지 다했을 때 100이 넘을까
		int sum = 0;
		int i = 0;
		
		while(true) {
			sum += i;
			if(sum > 100) break;
			i++;
		}
		System.out.println("1부터 " + i + "까지 더하면 " + sum + "임");
		
	}

}
