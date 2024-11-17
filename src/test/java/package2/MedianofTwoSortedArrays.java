package package2;

public class MedianofTwoSortedArrays {

	public static void main(String[] args) {
		
		//https://www.youtube.com/watch?v=xZed_DXZNoU

		int arr1[] = { 1, 3, 5, 6, 9 };
		int arr2[] = { 2, 4, 7 };

		int arrlength = arr1.length + arr2.length;

		int[] merged = new int[arrlength];
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < arr1.length && j < arr2.length) {

			if (arr1[i] < arr2[j]) {

				merged[k] = arr1[i];
				i++;
				k++;
			} else {

				merged[k] = arr2[j];
				j++;
				k++;
			}

		}

		while (i < arr1.length) {
			merged[k] = arr1[i];
			i++;
			k++;
		}

		while (j < arr2.length) {
			merged[k] = arr2[j];
			j++;
			k++;
		}

		int mid = merged.length / 2;
		double med = 0.0;

		if (merged.length % 2 == 1) {
			System.out.println("Median is :" + merged[mid]);

		} else {
			med = (merged[mid] + merged[mid - 1]) / 2.0;
			System.out.println("Median is :" + med);
		}

	}

}
