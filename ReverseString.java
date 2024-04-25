package Nimap;

public class ReverseString {
	//String Builder 
	static void reverse4(String str) {
		StringBuilder sb = new StringBuilder(str);
		System.out.print(sb.reverse());
	}
	
	//Using String Buffer
	static void reverse3(String str) {
		StringBuffer sbBuffer = new StringBuffer(str);
		System.out.print(sbBuffer.reverse());
	}
	
	//Using charAt method
	static void reverse2(String str) {
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
	}
	
	//Using toCharArray method
	static void reverse1(String str) {
		str.length();
		char[] ch = str.toCharArray();
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(ch[i]);
		}
	}

	public static void main(String[] args) {
		String s = "hello";
		reverse1(s);
		System.out.println();
		reverse2(s);
		System.out.println();
		reverse3(s);
		System.out.println();
		reverse4(s);

	}

}
