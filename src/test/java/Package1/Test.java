package Package1;

public class Test {
	
	static Test test;

	static {
		System.out.println("static block");
	}
	
	{
		System.out.println("first init block");
		System.out.println(test);
	}
	
	{
		System.out.println("second init block");
	}
	
	
	public static void main(String[] args) {
		staticMethod();
		test = new Test();
		test.print();
		Test test2 = new Test();
		test.print();
	}

	private void print() {
		System.out.println("print method");
	}
	
	private static void staticMethod() {
		System.out.println("static method");
	}
	
	
	
	/*static block
	static method
	first init block
	test----
	second init block
    print method
	first init block
	test-----
	second init block
	print method*/
}
