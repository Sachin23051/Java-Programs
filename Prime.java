package Nimap;

//import java_module.String.string1;

public class Prime {
public static void main(String []args) {
	int n =17;
	
	if(n<1) {
		System.out.println("Number is Not Prime");
	}
	for(int i=2;i<n;i++) {
		if(n%i==0) {
			System.out.println("Number is Not Prime");
			break;
		}
		else {
			System.out.println("Number is Prime");
			break;
		}
		
	}
}
}
