package Nimap;


public class CharOccurance {

	public static void main(String[] args) {

		String string = "SachinGupta";
		char replace = 'a';
		
		if(string.indexOf(replace)==-1) {
			System.out.println("Character is not present");
		    System.exit(0);
		}
		
		char [] ch = string.toCharArray(); 
		int count=1;
		for(int i=0; i<ch.length; i++ ) {
			if(ch[i]==replace) {
			ch[i]= String.valueOf(count).charAt(0);
			count++;
			}
			}
		System.out.println(new String(ch));
		}
	
		
	}


