package package2;

public class XYZ {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print("Z" + ",");
			} else if (i % 3 == 0) {
				System.out.print("X" + ",");
			} else if (i % 5 == 0) {
				System.out.print("Y" + ",");
			} else {
				System.out.print(i + ",");
			}
		}
	}
}
