package pattern;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		n1=0,n2=1,n3=n1+n2;
//		n1=n2
//				n2=n3 
		int n = 10;
	int n1=0,n2=1,n3;
	System.out.print(n1+" "+n2);
	
	
	for(int i=2; i<=n;i++) {
		n3= n1+n2;
		System.out.print(" "+n3);
		n1=n2;
		n2=n3;
		
	}
	
				

	}

}
