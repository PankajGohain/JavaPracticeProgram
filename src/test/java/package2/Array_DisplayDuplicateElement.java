package package2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Display duplicate values in the array

public class Array_DisplayDuplicateElement {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 6, 3, 6, 1, 3, 1, 6, 7, 8 };

		Set<Integer> set = new HashSet<Integer>(); // Through set but it has some problem

		for (int a : arr) {
			if (set.add(a) == false) {
				System.out.println(a);
			}
		}

		System.out.println("======================================================");
		
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>(); //Works fine

		for (int b : arr) {
			if (hmap.containsKey(b)) {
				hmap.put(b, hmap.get(b) + 1);
			} else {
				hmap.put(b, 1);
			}
		}

		Set<Map.Entry<Integer, Integer>> eset = hmap.entrySet();

		for (Map.Entry<Integer, Integer> mapset : eset) { //or for (Map.Entry<Integer, Integer> mapset : hmap.entrySet())
			if (mapset.getValue() > 1) {
				System.out.println(mapset.getKey());
			}
		}

	}

}
