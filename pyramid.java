package pattern;

public class pyramid {

	public static void main(String[] args) {
//		          *
//		         * * 
//		        * * *  
//		       * * * * 
//		n=4;
//		r=n;
//		n-r;
		
		
		
		int n=4;
		
		for(int i=1; i<=n;i++) {
			for(int j=0; j<=n-i;j++) {
				System.out.print(" ");
			}
//			for(int j=i;j>0;j--) {
//				System.out.print("*");
//			}
			for(int j=1;j<=i;j++) { 
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}


