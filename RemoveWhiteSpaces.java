package StringPractice;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String s = "V i s h a l";
		String res= s.replaceAll("\\s", "");
		System.out.println(res);

	}

}
