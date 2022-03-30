package package2;

public class CountConsecutiveOne {

	public static void main(String[] args) {

		String s = "110011101111011111"; // this is string not array
		int maxCount = 0;
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1') {
				count++;
				if (count > maxCount)
					maxCount = count;
			} else {
				count = 0;
			}
		}

		System.out.println(maxCount);
	}
}
