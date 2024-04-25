package Nimap;

public class reverseWord {

	public static void main(String[] args) {
		// Reverse word in a string
		
		String topper = "Sachin Gupta";
		
		String[] words =topper.split(" ");
	    String output ="";
		
		for(String word: words) {
			String reverseWord ="";
			for(int i=word.length()-1;i>=0;i--) {
				reverseWord += word.charAt(i); 
			}
			output = reverseWord +" "+ output ;
		}
		
		System.out.println(output);
		

	}

}
