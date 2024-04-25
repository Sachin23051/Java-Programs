package Nimap;

public class RemoveSpecialChar {

	public static void main(String[] args) {
		
		String string = "@Jav&a";
		
		String res = string.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(res);

	}

}
