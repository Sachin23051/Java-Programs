package Nimap;

import java.util.Arrays;

public class ArrayEqualEelements {

	public static void main(String[] args) {
		// to check the equality of two array
		int [] arr = {1,2,3,4};
		int [] arr1 = {1,2,3,5};
		boolean equalornot= true;
		if(arr.length== arr1.length) {
		for(int i=0; i<arr.length;i++) {
			
			if(arr[i]!=arr1[i]) {
				equalornot = false;
				}
		}
		}

          else {
			equalornot = false;
		}
		if(equalornot) {
			System.out.println("equal");
		}else {
			System.out.println("not equal");
		}
		System.out.println(Arrays.equals(arr, arr1));
	}

}
