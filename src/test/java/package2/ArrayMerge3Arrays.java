package package2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayMerge3Arrays {

	public static void main(String[] args) {

		Integer[] a = { 1, 2, 3, 5, 4 };
		Integer[] b = { 6, 7, 8, 9, 2 };
		Integer[] c = { 10, 11, 12, 5, 7 };

		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);

		List<Integer> a1 = Arrays.asList(a);
		List<Integer> b1 = Arrays.asList(b);
		List<Integer> c1 = Arrays.asList(c);

		ArrayList<Integer> F = mergeArray(a1, b1);
		System.out.println(mergeArray(F, c1));
	}

	public static ArrayList<Integer> mergeArray(List<Integer> A, List<Integer> B) {

		int m = A.size();
		int n = B.size();
		int i = 0;
		int j = 0;

		ArrayList<Integer> C = new ArrayList<Integer>(m + n);
		while (i < m && j < n) {

			if (A.get(i) < B.get(j))
				C.add(A.get(i++));
			else
				C.add(B.get(j++));

		}

		while (i < m) {
			C.add(A.get(i++));
		}

		while (j < n) {
			C.add(B.get(j++));
		}

		return C;
	}

}
