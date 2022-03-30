package Package1;

public class SimpleReturn {

	public static void main(String[] args) {
	  
		String s="dsff";
		function(s);
		System.out.println();
	}
	public static void function(String m) {
		if(m.length()==0) {
		//m=m.substring(1);
		return;
	}
System.out.println("4325436");
function(m.substring(1));
System.out.println(m);
//function(m.substring(1));
}
}

