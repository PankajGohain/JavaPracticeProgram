package Package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LargestPrimeFactor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for which you want to find the prime factor");
		int n=sc.nextInt();
		List<Integer> li= new ArrayList<>();
		int i=2;
		//int sum=0;
		while(n>1){
			
			if(n%i==0){
				
				li.add(i);
				//sum=sum+i;
				n=n/i;
			}
			
			else{
				
				i++;
			}		
		}
		
		Collections.sort(li);
		System.out.println(li.get(li.size()-1));
		
		//System.out.println(sum);
	}

}
