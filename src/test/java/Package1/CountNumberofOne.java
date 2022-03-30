package Package1;

import java.util.Scanner;

public class CountNumberofOne {

	public static void main(String[] args) {
		
		int arr[]={1,1,1,0,0,1,1,1,1,1,0,0,1,1};
		int count=0, count_max = 0;
		 for(int i=0;i<arr.length;i++){
			 
			 if(arr[i]==1){
				 count++;
			}
			 else{
				 count=0;
			 }
		 			
			 if(count>count_max){
				
				 count_max=count;
		}
	}
		 System.out.println(count_max);
		
	}
}


