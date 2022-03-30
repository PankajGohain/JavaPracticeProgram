package Package1;

public class SumOfMultiples {

	public static void main(String[] args) {
		
		int sum=0;
		int n;
		
		for(int i=1;i<1000;i++){
			
			n=i;
			if(n%3==0||n%5==0){
				
				sum=sum+n;
			}
		}
		
		System.out.println(sum);

	}

}
