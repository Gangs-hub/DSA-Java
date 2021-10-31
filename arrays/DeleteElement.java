package arrays;

import java.util.Arrays;

public class DeleteElement {

	public static void main(String[] args) {
		
		int[]arr= {1,2,3,4,5,6};
		
		int size=arr.length;
	int del=4;
	int index=-1;
	
	for(int i=0;i<size;i++)
	{
		if(arr[i]==del)
		{
			index=i;
			System.out.println("index here is "+index);
			break;
		}
	}
	if(index !=-1) 
	{
	for(int i=index;i<size-1;i++)
	{
	arr[i]=arr[i+1];
		
		
	}
		
	}
	
	System.out.println(Arrays.toString(arr));
		
		
	}
	
	
}
