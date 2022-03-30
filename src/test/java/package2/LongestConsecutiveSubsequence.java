package package2;

import java.util.HashSet;

//https://www.youtube.com/watch?v=HgGDf0Ddu8E&list=PLlhM4lkb2sEiB1S_dHX8id1i_IN81t-q2&index=11

public class LongestConsecutiveSubsequence {

	public static void main(String[] args) {

		int arr[] = { 1, 9, 3, 10, 4, 20, 2 };
		int long_lenght = 0;

		HashSet<Integer> hs = new HashSet<Integer>();

		// Hash all the array elements
		for (int i = 0; i < arr.length; ++i) {
			hs.add(arr[i]);
		}

		for (int i = 0; i < arr.length; i++) {
			if (!hs.contains(arr[i] - 1)) {

				int num = arr[i];
				while (hs.contains(num)) {
					num++;
				}
				if (long_lenght < num - arr[i]) {
					long_lenght = num - arr[i];
				}
			}
		}

		System.out.println("Longest subsequence lenght is: " + long_lenght);

	}

}
