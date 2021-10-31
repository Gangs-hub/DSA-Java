package arrays;

public class SecondLargest {
public static void main(String[] args) {
	int[]arr= {1,2,5,8,9,15,4};
	int large=0;
	int res=-1;
	
	for(int i=1;i<arr.length;i++)
	{
		if(arr[i]>arr[large])
		{
			res=large;//set 0 here 
			large=i;
			
		}else if(arr[i]!=arr[large])
		{
			if(res==-1||arr[i]>arr[res])
			{
				res=i;
			}
		}
		
		
	}
	System.out.println(res);
	
	
	
	
}
}
