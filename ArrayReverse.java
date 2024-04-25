package Nimap;


import java.util.*;

public class ArrayReverse {
       public static void reverseString(int arr[]) {
    	   int start = 0;
    	   int end = arr.length-1;
    	   
    	   while(start<end) {
    		   int temp = arr[start];
    		   arr[start]= arr[end];
    		   arr[end]= temp;
    		   --end;
    		   ++start;
    	   }
       }
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		reverseString(arr);
		
		//System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
