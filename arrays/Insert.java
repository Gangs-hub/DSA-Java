package arrays;

import java.util.Arrays;

public class Insert {

	public static void main(String[] args) {
		
		int res=insertL();
		System.out.println(res);
		
		
	}
	
	public static int insertL()
	{
		int ret=0;
		        int capacity=5;
				int[]arr=new int[capacity];
				arr[0]=5;
				arr[1]=6;
				arr[2]=7;
				arr[3]=8;
				arr[3]=9;//override values
				arr[4]=69;
				System.out.println(Arrays.toString(arr));
				//wann to add element 9 at 5th(4th index) position;
				int x=9;
				int size=arr.length;
				if(capacity==size) {
					ret= size;
				}
					
		return ret;			
	}
				
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

