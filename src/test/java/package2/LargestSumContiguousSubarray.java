package package2;

//https://www.youtube.com/watch?v=U4iVyHQQIqA&list=PLlhM4lkb2sEiB1S_dHX8id1i_IN81t-q2&index=12

public class LargestSumContiguousSubarray {

	public static void main(String[] args) {

		int arr[] = { 4, -2, -3, 4, -1, -2, 1, 5, -3 };

		int largest_sum = Integer.MIN_VALUE;
		int sum = 0;
		int start = 0, end = 0, count = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];

			if (sum>largest_sum) {
				largest_sum = sum;
				start = count; // these two lines are to find the starting & ending position
				end = i;
			}

			if (sum < 0) {
				sum = 0;
				count = i + 1; //to find the starting & ending position
			}
		}

		System.out.println("Largest subarray value is:" + largest_sum);
		System.out.println("Start Index is:" + start);
		System.out.println("End Index is:" + end);
	}

}
