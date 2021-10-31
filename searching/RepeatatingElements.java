package searching;

import java.util.Arrays;

public class RepeatatingElements {
 //conditions:
	//array should not modify
	// smallest & largest elements range must have values
	
	
	public static void main(String[] args) 
	{
		int arr[]= {0,2,1,3,2,2};
		int result=repeateNaive(arr);
		System.out.println("result is "+result);
		int res1=repeateNaive1(arr);
		System.out.println("second method is "+res1);
		
	      int x= repeateNaive2(arr);
	      System.out.println("ans X is "+x);
		
	}
	
	
	
	//super naive solution O (N^2)
	public static int repeateNaive(int arr[])
	{
		int res=-1;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					res=arr[i];
					break;
				}
			}
		}
		return res;
	}
	
	//O nlogn
	public static int repeateNaive1(int arr[])
	{
		int res=-1;
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < arr.length-1; i++) 
		{
			if(arr[i]==arr[i+1])
			{
				res=arr[i];
				break;
			}
		}
		return res;
		
	}
	//O(n) and space as O(n)
	public static int repeateNaive2(int arr[])
	{
		
		int N=arr.length;
		boolean array[]=new boolean[N];
		System.out.println(Arrays.toString(array));
		
		for (int i = 0; i < arr.length; i++) 
		{
			
		if(array[arr[i]])//very perfect example bcz here smallest and largest range element in array must have values
		return arr[i];
	    array[arr[i]]=true;
		
		
		}
		return -1;
		
	}
	
}
