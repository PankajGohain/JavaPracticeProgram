package package2;

import java.util.HashSet;
import java.util.Set;

public class Array_Subset {

	public static void main(String[] args) {

		int[] s2 = { 5, 8, 2 };
		int[] s1 = { 1, 5, 4, 6, 8, 2 };
		int[] s3 = { 5, 8, 2, 7 };

		Set<Integer> s = new HashSet<Integer>();
		for (Integer i : s1) {
			s.add(i);
		}
		System.out.println(isContains(s2, s));
		System.out.println(isContains(s3, s));
	}

	private static boolean isContains(int[] array, Set<Integer> s) {
		for (int i : array) {
			if (s.add(i)) {
				return false;
			}
			
		}
		return true;
	}
}
