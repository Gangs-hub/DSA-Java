package arrays;

import java.util.Arrays;

public class DuplicatesRemoval {
public static void main(String[] args) {
	
	int[]arr= {7,2,2,4,5,18,7,7};
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));	
	
	int []arr1=new int[7];
	
	arr1[0]=arr[1];
	int res=1;
	
	for(int i=1;i<arr.length;i++)
	{
		if(arr[i]!=arr[i-1])
		{
			arr1[res++]=arr[i];
		}
		
	}
	System.out.println(Arrays.toString(arr1));
	
	
	
	
}
}
