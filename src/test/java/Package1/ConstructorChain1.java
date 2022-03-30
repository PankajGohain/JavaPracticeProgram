package Package1;

public class ConstructorChain1 extends ConstructorChain2 {

	public static void main(String[] args) {
		ConstructorChain1 cf = new ConstructorChain1(32);

	}

	ConstructorChain1(int x) {
		//super(36);
	
	System.out.println("print name");
	}}
	
/*
 * ConstructorChain1(int t) { super(12,13); System.out.println("print kaaaa"); }
 * 
 * ConstructorChain1(int x, int y) { super(10,5);
 * System.out.println("print house"); }
 * 
 * }
 */
