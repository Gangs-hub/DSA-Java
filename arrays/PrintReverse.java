package arrays;

import java.util.Arrays;

public class PrintReverse {
public static void main(String[] args) {
	int[]arr= {1,2,3,4,5,6,7};

	int size =arr.length;    //7
	int[]arr1=new int[size];
	int x=0;
	/*for(int i=size-1;i>=0;i--) 
	{
		System.out.print(" "+arr[i]);
		arr1[x++]=arr[i];
	}
	System.out.println();
	System.out.println(Arrays.toString(arr1));       //Reversed the existing array
	*/
	//Largest element at 0 to nextsss
	for(int i=0;i<size;i++)
	{
		for(int j=i+1;j<size;j++)
		{
		if(arr[i]<arr[j])
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		}
	}
	
	System.out.println(Arrays.toString(arr));  
}
}
