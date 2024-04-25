package StringPractice;
import java.util.*;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// Removing the duplicates from the String
		String s = "Programming";
		//method 1
		StringBuilder sb1 = new StringBuilder();
		Set<Character> set= new HashSet<Character>();
		
		for(int i=0; i<s.length();i++) {
			set.add(s.charAt(i));
		}
		for(char ch: set) {
		   sb1.append(ch);
		}
		System.out.println(sb1);
		
		
		
		//method 2
		char[] ch = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<ch.length;i++) {
			boolean duplicate = false;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
				duplicate = true;
				break;
			}
			
		}if(!duplicate) {
			sb.append(ch[i]);
		}
			
	}
		System.out.println(sb);


}
}

