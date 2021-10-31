package strings;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abaac";
		String s2="aacba";
		//boolean res=anna(s1,s2);
       // System.out.println(res);
        boolean result=effiSol(s1,s2);
        System.out.println(result);
        
	}
	public static boolean anna(String s1,String s2)
	{
		if(s1.length()!=s2.length())
		{
			return false;
		}
		
		char []arr1=s1.toCharArray();
		char []arr2=s2.toCharArray();
		
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		String newForm1=new String(arr1);
		String newForm2=new String(arr2);
		System.out.println(newForm1);
		System.out.println(newForm2);
		if(newForm1.equals(newForm2))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//space O(char) time O(lengths of each string)
	public static boolean effiSol(String s1,String s2)
	{
		boolean res=false;
		if(s1.length()!=s2.length()) 
		{
			res= false;
		}
		
		 final  int CHAR=256;
		 int arr[]=new int[CHAR];
		 
		 for (int i = 0; i < s1.length(); i++)
		 {
			arr[s1.charAt(i)]++;//suppose its A then it got converted to 65th position of array
			arr[s2.charAt(i)]--;
			
		}
		 
		 for (int i = 0; i < arr.length; i++) 
		 {
			if(arr[i]!=0) 
			{
				res= false;
			
		    }
			else
			{
				res=true;
			}
		 }
		
		
		return res;
		
		
	}
}
