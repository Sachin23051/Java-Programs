package Nimap;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupChar {

	public static void main(String[] args) {
		String string = "Programming";
		//Using Set interface
		StringBuffer sBuffer = new StringBuffer();
	    Set<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<string.length();i++) {
			set.add(string.charAt(i));
		}
		for(Character c: set) {
			sBuffer.append(c);
			
		}
		System.out.println(sBuffer);
		
		
		//using toCharArray method
		char[] ch = string.toCharArray();
		StringBuilder sb1 = new StringBuilder();
		
		for(int i=0; i<ch.length;i++) {
			boolean repeat = false;
			for(int j=i+1; j<ch.length;j++) {
				if(ch[i] == ch[j]) {
					repeat = true;
					break;
				}
			}
			if(!repeat) {
				sb1.append(ch[i]);
			}
		}
		System.out.println(sb1);
		

	}

}
