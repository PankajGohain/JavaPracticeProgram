//Write a program to find out all the Palindromic years till 2017. 

package Package1;

public class Question2 {

	public static void main(String[] args) {
		
	    int x, temp=0;
	    int n;
	    System.out.println("Palidromic year till 2017 are:");
		for(int i=1;i<=2017;i++){
			
 			n=i;
			temp=0;
			while(n>0){
				
				x=n%10;
				temp=(temp*10)+x;
				n=n/10;
		}
			
			if(temp==i){
				
				System.out.println(temp);
				
			}
	}
		
	}

}
