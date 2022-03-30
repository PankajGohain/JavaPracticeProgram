package Package1;

public class LargestPalindromeMadeFromProduct {

	public static void main(String[] args) {
		
		int count=0;
		int value;
		
		for(int i=100;i<=999;i++){
			
			for(int j=i;j<=999;j++){
				
				value=i*j;
				StringBuilder sb = new StringBuilder(""+value);
				String sb1=""+value;
				sb.reverse();
				if(sb1.equals(sb.toString())&&count<value){
					
						count=value;
				}
			}
		}
		System.out.println(count);
	}

}
