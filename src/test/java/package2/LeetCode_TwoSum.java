package package2;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_TwoSum {

	public static void main(String[] args) {

		int num[] = { 2, 6, 7, 9 };
		int target = 9;

		for (int i = 0; i < num.length; i++) {

			for (int j = i; j < num.length; j++) {

				int com = target - num[i];
				if (num[j] == com) {
 
					System.out.println(i + " and " + j);
				}

			}
		}

		Map<Integer, Integer> hmap = new HashMap<Integer, Integer>();

		for (int i = 0; i < num.length; i++) {

			int digit = target - num[i];

			if (hmap.containsKey(digit)) {
				System.out.println(hmap.get(digit) + " and " +i );

			} else {

				hmap.put(num[i], i);
			}

		}

	}

}
