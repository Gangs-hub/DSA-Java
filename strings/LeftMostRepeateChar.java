package strings;

import java.util.Arrays;

public class LeftMostRepeateChar {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String s ="cabbad";
		int ans=leftMost(s);
		//System.out.println(ans);
		int ans1=effi1(s);
		System.out.println(ans1);
		int resultIs=effi2(s);
		System.out.println(resultIs);
		
		

	}
	//Nive sol to  get left most repeating char 
	public static int leftMost(String s)
	{
		for (int i = 0; i < s.length(); i++)
		{
		for (int j = i+1; j < s.length()-1; j++)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				return i;
			}
		}	
		}
		return -1;
	}
	public static int effi1(String s)
	{
		final int CHAR=256;
		int arr[]=new int [CHAR];
		
		for (int i = 0; i < s.length(); i++) 
		{
		arr[s.charAt(i)]++;	
		}
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]>1)
			{
				return 1;
			}
		}
	return -1;
	
	
    }
	public static int effi2(String s2)
	{
		final int CHAR=256;
		boolean arr[]=new boolean[CHAR];
		//Arrays.fill(arr, -1);
		int res=-1;
		//System.out.println(Arrays.toString(arr));
	for(int i=s2.length()-1;i>=0;i--)
	{
		  if(arr[s2.charAt(i)])
		  {
			 res=i; 
		  }
		  else
		  {
			  arr[s2.charAt(i)]=true;
		  }
	}
	return res;
	
	}
}
