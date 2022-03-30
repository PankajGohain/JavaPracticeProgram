package package2;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String str = "      Geeks     for    Geeks        ";
		String str1 = "      Geeks  1   for    Geeks   2     ";

		// Call the replaceAll() method
		// str = str.replaceAll("\\s", "");

		char cstr[] = str.toCharArray();
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < cstr.length; i++) {
			if (cstr[i] != ' ' && cstr[i] != '\t') {
				sb.append(cstr[i]);
			}
		}
		System.out.println(sb);

//============================Method2======================================
		String rev = "";

		char[] arr = str1.toCharArray();

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != ' ' && arr[i] != '\t') {
				rev = rev + arr[i];

			}

		}

		System.out.println("Method2:" + rev);

// =======================Method3================

		String str2 = str1.replaceAll("\\s", "");
	}

}
