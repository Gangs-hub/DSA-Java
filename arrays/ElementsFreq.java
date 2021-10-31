package arrays;

import java.util.Arrays;

public class ElementsFreq {
public static void main(String[] args) {
	//in sorted array this solution
	//frq();
	freq1();
	
	
	
}

public static void frq() 
{
int []arr= {10,10,10,25,15,25,13,13,7};	
    int count=0;
for(int i=0;i<arr.length;i++)
{
	   count=1;
	for(int j=i+1;j<arr.length-1;j++)
	{
	if(arr[i]==arr[j])
	{
		count++;
		arr[j]=0;
	}
		
	}
	if(arr[i]!=0)
	{
	System.out.println(arr[i]+" "+count);
	}
	
}




	
}//in sorted array
public static void freq1()
{
	//int []arr= {10,10,20,20,16};
	int[]arr= {10,20};
	Arrays.sort(arr);
	int n=arr.length;
	int i=1; int frq=1;
	while(i<n)
	{
		while(i<n && arr[i]==arr[i-1])//in while also need to check condition of i<n 
		{
			frq++;
			i++;
			
			
		}
		System.out.println(arr[i-1]+" "+frq);
		i++;
		
	}
	if(n==1||arr[n-1]!=arr[n-2])
	{
		System.out.println(arr[n-1]+" "+frq);
	}
	
	
	
}




}
