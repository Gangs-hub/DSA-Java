package arrays;

import java.util.Arrays;

public class ZeosAtEnd {
public static void main(String[] args) {
	int[]arr= {7,0,2,0};    //Length 4 index 3
	
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==0)
		{
			
			System.out.println(i);// 4
		
			//hv to find next non zero digit
			for(int j=i+1;j<arr.length;j++)
			{
				System.out.println(j);
				if(arr[j]!=0)
				{
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
				
			}
		}
		
	}
	System.out.println(Arrays.toString(arr));	
}//method
}//class
	


