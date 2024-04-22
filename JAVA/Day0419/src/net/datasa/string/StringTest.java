package net.datasa.string;

public class StringTest {

	public static void main(String[] args) {
		String cityStr = "서울,대전,대구,부산";
		String[] cities = cityStr.split(",");
		
		for(String city : cities) {
			System.out.println(city);
		}
		
		String phoneStr = "010-1234-5678";
		String[] phoneArr = phoneStr.split("-");
		System.out.println(phoneArr[1]);
		
	}

}
