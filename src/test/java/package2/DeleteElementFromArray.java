//https://www.w3resource.com/java-exercises/array/index.php

package package2;

import org.apache.commons.lang3.ArrayUtils;

public class DeleteElementFromArray {

	public static void main(String[] args) {

		System.out.println("Before removing element");
		int arr[] = { 1, 34, 2, 23, 35, 65 };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();
		System.out.println("============");
		System.out.println("After removing element 23");
		// Remove element using Apache common ArrayUtils
		arr = ArrayUtils.removeElement(arr, 23); //will remove that element
		arr=ArrayUtils.add(arr, 3, 99);
		
		
		//arr = ArrayUtils.remove(arr, 2); //removing element at index 2
		

		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		
		//====================Without using inbuild function====================================
		
		int newLength=removeElement(arr,23);
		for (int i = 0; i < newLength; i++) {
			System.out.print(" "+arr[i]);
		}
		
	}
	
	public static int removeElement(int[] arr,int element)
	{
		int j=0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=element)
			{
				arr[j++]=arr[i]; //insert the element & increment the position
			}
		}
		return j;
	}
	}
