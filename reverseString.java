package StringPractice;

public class reverseString {

	public static void main(String[] args) {
		//Reverse a String
		String str = "Vishal";
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}

	}

}
