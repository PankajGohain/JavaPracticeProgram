package Package1;

import java.util.ArrayList;

public class GFG {

	public static void main(String[] args) {

		String s = "abbb";
		System.out.println(distinctPermute(s));
	}

	static boolean isPresent(String s, ArrayList<String> Res) {

		// If present then return true
		for (String str : Res) {

			if (str.equals(s))
				return true;
		}

		// Not present
		return false;
	}

	// Function to return an ArrayList containg
	// all the distinct permutations of the string
	static ArrayList<String> distinctPermute(String str) {

		// If string is empty
		if (str.length() == 0) {

			// Return an empty arraylist
			ArrayList<String> baseRes = new ArrayList<>();
			baseRes.add("");
			//System.out.println(baseRes);
			return baseRes;
		}

		// Take first character of str
		char ch = str.charAt(0);

		// Rest of the string after excluding
		// the first character
		String restStr = str.substring(1);

		// Recurvise call
		ArrayList<String> prevRes = distinctPermute(restStr);
		// System.out.println(restStr);
		// return prevRes;

		// Store the generated sequence into
		// the resultant Arraylist
		ArrayList<String> Res = new ArrayList<>();
		for (String s : prevRes) {
			for (int i = 0; i <= s.length(); i++) {
				String f = s.substring(0, i) + ch + s.substring(i);
System.out.println(f);
				// If the generated string is not
				// already present in the Arraylist
				if (!isPresent(f, Res))

					// Add the generated string to the Arraylist
					Res.add(f);
			}
		}
//System.out.println(Res);
		// Return the resultant arraylist
		return Res;
	}

}
