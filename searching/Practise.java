package searching;


import java.util.Arrays;
import java.util.List;

public class Practise {
public static void main(String[] args) {
	String given="a1 b3 c6";
	String arr[]=given.split(" ");
	System.out.println(Arrays.toString(arr));
	
	List<String> arList=Arrays.asList(arr);
	
	for(String s:arList)
	{
		char hereIs=s.charAt(0);
		int numRepeate=Integer.parseInt(s.substring(1));
		//System.out.println(hereIs +" "+numRepeate);
		
		for(int i=0;i<numRepeate;i++)
		{
			System.out.print(hereIs);
		}
		System.out.println();
	}
	
}
}
