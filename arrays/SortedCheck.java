package arrays;

public class SortedCheck {
public static void main(String[] args) {
	int[]arr= {1,2,3,4,5,6,7};
	boolean res=true;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[j]<arr[i]) 
			{
				res= false;
			}
		}
	}
	System.out.println(res);
	
	
}
}
