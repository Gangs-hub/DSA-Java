package arrays;

public class MaxDiff {
public static void main(String[] args) {
	
	//diff();
	diff1();
	
}

public static void diff()
{
	int[]arr= {2,3,10,6,4,8,1};
	int size =arr.length;
	//System.out.println(arr[size-1]);
	int max;
	int res=arr[1]-arr[0];
	for(int i=0;i<size;i++)
	{
		for(int j=i+1;j<size-1;j++)
		{
			max=Math.max(res,arr[j]-arr[i]);
		//System.out.println(max);
		if(max>res) 
		{
			res=max;
		}
		}
		
	}
	System.out.print(res);
	
	
}
public static void diff1()
{
	int[]arr= {2,3,10,6,4,8,1};
	
	int res=arr[1]-arr[0];
	int minVal=arr[0];
	
	for(int i=0;i<arr.length;i++)
	{
		res=Math.max(res, arr[i]-minVal);
		minVal=Math.min(minVal, arr[i]);
		
	}
	System.out.println(res);
	
	
	
}





}
