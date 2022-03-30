package Package1;

public class DuplicateArray {

	public static void main(String[] args) {


		int[] arr={1, 2, 5, 5, 6, 6, 6,7, 2};
		int count=0;
		for(int i=0;i<arr.length;i++){
			
			for(int j=i+1;j<arr.length;j++){
				
				if(arr[i]==arr[j]){
					
					count++;
					if(count==1){
						System.out.println(arr[i]);
						break;
					}
					
				}
			}
			
			count=0;
		}

	}

}
