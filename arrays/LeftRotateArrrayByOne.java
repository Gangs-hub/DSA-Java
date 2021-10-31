package arrays;

import java.util.Arrays;

public class LeftRotateArrrayByOne {
public static void main(String[] args) {
	int[]arr= {1,2,3,4,5}; 
	int size=arr.length;
	//left rotate array by one
	int temp=arr[0];
	for(int i=1;i<arr.length;i++)
		
	{
		
		arr[i-1]=arr[i];
		//arr[size-1]=temp;
		
	}
	arr[size-1]=temp;
	System.out.println(Arrays.toString(arr));
	
	//Note: to roatate by 2 then call above function twice so on.
	
}
}
