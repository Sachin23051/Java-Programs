package pattern;

public class Factorial {
	
	static int factorial(int n) {
		if(n==0) {
			return 1;
		}else {
			return n*factorial(n-1);
		}
	}

	public static void main(String[] args) {
		// n*fact(n-1)
		// for fact*=i;
		System.out.println(factorial(5));
		
//		int n =5;
//		int fact =1;
//		for(int i =1;i<=n;i++) {
//			fact=fact*i;
//			System.out.println(fact);
//		}
//		System.out.println(fact);

	}

}
