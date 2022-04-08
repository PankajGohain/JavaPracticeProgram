package package2;

public class fibonnaciRecursion {

	public static void main(String[] args) {

		int n = 10;
		System.out.println(fib(n));
	}

	public static int fib(int n) {
		if (n <= 1) {
			return n;
		}

		return fib(n - 1) + fib(n - 2);
	}

}

//4+3
//3+1
//2
//1
//sum all these number