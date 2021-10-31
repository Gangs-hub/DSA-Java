package strings;

import java.util.Arrays;

public class LeftMostNonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="geeksforgeeks";
     int res=leftMost(s);
     System.out.println(res);
     int result=leftMostEffi(s);
     System.out.println(result);
     int res1=efficient(s);
     System.out.println("result is "+res1);
     int res11= effi1(s);
     System.out.println("result is** "+res11);
	}
	public static int leftMost(String s)
	{
		for (int i = 0; i < s.length(); i++)
		{
		boolean flag=false;	
		for (int j = 0; j < s.length(); j++)
		{
			if(i!=j && s.charAt(i)==s.charAt(j))
			{
				flag=true;
			}
		}
		if(flag==false)
			return i;
		
		
		
		}
		return -1;
		
		
		
	}
	public static int leftMostEffi(String s)
	{
		int res=-1;
		final int  CHAR=256;
		int arr[]= new int[CHAR];
		for (int i = 0; i < s.length(); i++)
		{
		arr[s.charAt(i)]++;	
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1) 
			{
				res= 1;
			}
		}
		
		return res;
		
		
	}
	
public static int efficient(String s)
{
	final int CHAR=256;
	int arr[]=new int[CHAR];
	Arrays.fill(arr, -1);
	
	for (int i = 0; i < s.length(); i++) 
	{
		if(arr[s.charAt(i)]==-1)
		{
			arr[s.charAt(i)]=i;
		}
		else
		{
			arr[s.charAt(i)]=-2;
		}
	}
	int result=Integer.MAX_VALUE;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>=0)
		{
			result=Math.min(result, arr[i]);
		}
	}
	return (result==Integer.MAX_VALUE)?-1:result;
}
public static int effi1(String s)
{
	final int CHAR=256;
	int arr[]=new int[CHAR];
	Arrays.fill(arr, -1);
	
	for(int i=0;i<s.length();i++)
	{
		if(arr[s.charAt(i)]==-1) 
		{
			arr[s.charAt(i)]=i;
		}
		else
		{
			arr[s.charAt(i)]=-2;
		}
		
	}
	
	int result=Integer.MAX_VALUE;
	for (int i = 0; i < arr.length; i++) 
	{
		if(arr[i]>=0)
		{
		result=Math.min(result,arr[i]);
			
		}
	}
	
  return (result==Integer.MAX_VALUE)? -1:result;
	
}

}
