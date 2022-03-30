package package2;

//Program to find minimum number of platforms required on a railway station
//https://www.geeksforgeeks.org/minimum-number-platforms-required-railwaybus-station/

public class CalculatePlatform {

	public static void main(String[] args) {
		int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
		int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };

		int plat_needed = 1;
		int max_plat = 1;

		int i = 0;
		int j = 0;

		while (i < arr.length && j < dep.length) {
			if (arr[i] <= dep[j]) {
				plat_needed++;
				i++;
			} else {
				plat_needed--;
				j++;
			}
		}
		if (plat_needed > max_plat) {
			max_plat = plat_needed;
		}

		System.out.println("Minimum Number of Platforms Required: " + max_plat);
	}

}

// Sort arrival and departure arrays
//   Arrays.sort(arr);
//   Arrays.sort(dep);

/*
 * Complexity Analysis:
 * 
 * Time Complexity: O(N * log N). One traversal O(n) of both the array is needed
 * after sorting O(N * log N), so the time complexity is O(N * log N). Space
 * Complexity: O(1). As no extra space is required.
 */
//Time      Event Type     Total Platforms Needed at this Time                               
//9:00       Arrival                  1
//9:10       Departure                0
//9:40       Arrival                  1
//9:50       Arrival                  2
//11:00      Arrival                  3 
//11:20      Departure                2
//11:30      Departure                1
//12:00      Departure                0
//15:00      Arrival                  1
//18:00      Arrival                  2 
//19:00      Departure                1
//20:00      Departure                0
