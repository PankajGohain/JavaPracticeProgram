package package2;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Array_MergeArrayInSorted {

	//The problem here is it will remove the duplicate element
	
	public static void main(String[] args) {

		int a[] = { 1, 3, 5, 7, 4, 6 };
		int b[] = { 2, 4, 6, 8, 9, 2, 3 };

		Map<Integer, Boolean> tmap = new TreeMap<Integer, Boolean>();

		for (int i : a) {
			tmap.put(i, true);
		}

		for (int j : b) {
			tmap.put(j, true);
		}

		System.out.println(tmap);

		for (Entry<Integer, Boolean> eset : tmap.entrySet()) {
			System.out.println(eset.getKey());
		}
	}

}
