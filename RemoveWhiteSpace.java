package Nimap;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String string = "ja v a &^*";
		
		String res = string.replaceAll("\\s", "");
		System.out.println(res);

	}

}
