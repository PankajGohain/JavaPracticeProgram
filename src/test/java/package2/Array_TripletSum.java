package package2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_TripletSum {

	public static void main(String[] args) {

		int n = 6;
		int arr[] = { 1, 4, 45, 6, 10, 8 };
		int target = 13;

		Arrays.sort(arr);

		for (int i = 0; i < n - 1; i++) {
			int second = i + 1;
			int last = n - 1;

			while (second < last) {
				if (arr[i] + arr[second] + arr[last] == target) {
					System.out.println("Triplet is: " + arr[i] + "," + arr[second] + "," + arr[last]);
					return;
				} else if (arr[i] + arr[second] + arr[last] < target) {
					second++;
				} else {
					last--;
				}
			}
		}
		System.out.println("Triplet not found");

	}

}
