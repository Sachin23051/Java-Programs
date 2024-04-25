package StringPractice;

import java.util.Arrays;

public class StringSort {

	public static void main(String[] args) {
		// Sort the String
		String string= "Vishal";
		String string2=string.toLowerCase();
		char[] ch = string2.toCharArray();
		char temp=0;
		for(int i=0; i<ch.length;i++) {
			for(int j=i+1; j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					temp = ch[i];
					ch[i]= ch[j];
					ch[j] = temp;
					
				}
			}
			
		}
		System.out.println(new String(ch));
		System.out.println(Arrays.toString(ch));
	}

}
