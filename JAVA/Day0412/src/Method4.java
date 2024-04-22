
public class Method4 {

	public static void main(String[] args) {
		String text = "hello java!";

		makeTextBox(text);
	}
	
	static void makeTextBox(String str) {
		String boxedText = "";
		
		boxedText += makeBox(str);
		boxedText += "\n";
		boxedText += makeText(str);
		boxedText += "\n";
		boxedText += makeBox(str);
		
		System.out.println(boxedText);
	}

	static String makeBox(String str) {
		String box = "";
		int len = str.length() + 4;
		
		for(int i = 0; i < len; i++) {
			box += "-";
		}
		
		return box;
	}
	
	static String makeText(String str) {
		String text = "";
		
		text += "| ";
		text += str;
		text += " |";
		
		return text;
	}
}
