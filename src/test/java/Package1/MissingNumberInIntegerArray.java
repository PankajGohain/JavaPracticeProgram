package Package1;

public class MissingNumberInIntegerArray {

	public static void main(String[] args) {
		
		int sum=0;
        int a[]={1,2,3,4,5,7,8,9,6};
        for(int i=0;i<=a.length;i++){
        	
        	sum=sum+i;
        }
        
        System.out.println(sum);
        System.out.println("Missing Number is:" +(55-sum));

	}

}
