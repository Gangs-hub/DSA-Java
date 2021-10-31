package arrays;

import java.util.Arrays;

public class ReverseExistingArray {
public static void main(String[] args) {
	
	int[]arr= {1,2,3,4,5,18,7};
	int size=arr.length;
	int low=0;
	int high=size-1;
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	while(low<high)
	{
		int temp=arr[low];
		arr[low]=arr[high];
		arr[high]=temp;
		low++;
		high--;
		
	}
	System.out.println(Arrays.toString(arr));
	
}
}
