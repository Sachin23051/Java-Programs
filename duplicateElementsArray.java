package Nimap;

//import java.awt.TexturePaintContext.Int;
import java.util.HashMap;
import java.util.HashSet;

public class duplicateElementsArray {

	public static void main(String[] args) {
		int [] arr = {1,2,2,3,4,5};
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for(int i =0;i<arr.length;i++) {
			
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			}
			else {
			int value =map.get(arr[i]);
			
				map.put(arr[i],value +1);
			}
			
		}
		System.out.println(map);
		HashSet<Integer> h = new HashSet<Integer>();
		for(int i =0;i<arr.length;i++) {
			
			h.add(arr[i]);
		}
		System.out.println(h);

	}

}
