package Nimap;

import java.util.Arrays;

public class bubbleSort {

	public static void main(String[] args) {
		// Bubble sort
		
		int[] arr = {10,11,4,2,1};
		
		for(int i=0; i<arr.length; i++ ) {
			for(int j=i+1; j<arr.length;j++) {
				
				if(arr[i] >arr[j]) {
					int temp=arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
					
				}
			}
			
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[arr.length-2]);

	}

}
