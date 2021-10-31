package arrays;

public class MaxConsecutiveOnes {
	public static void main(String[] args) 
	{
		//maxCon();
		maxCon1();
	}
	
	public static void maxCon()
	{
		int[]arr= {0,1,1,1,0,1,1};
		int res=0;
		int count;
		for(int i=0;i<arr.length;i++)
		{
			count=0;
			for(int j=i;j<arr.length;j++)
			if(arr[j]==1)
			{
				count++;
			}
			else
			{
				break;
			}
			res=Math.max(res, count);
			System.out.println("res is "+res);
		}
		System.out.println(res);
		
		
		
	}
	//O(n)
	public static void maxCon1()
	{
	int[]arr= {0,1,1,0,1,1,1};	
	int size=arr.length;
	int count=0;
	int res=0;
	for(int i=0;i<size;i++)
	{
		if(arr[i]==0)
		{
			count=0;
			
		}
		else
		{
			count++;
			res=Math.max(res, count);//i=1 res=1
		}                             //i=2 res=2
		                              //i=3 res=0
		                              //i=4 res=1
		                               //i=5 res=2
		
		                                //i=6 res=3
			
			
	}
	System.out.println(res);	
		
	}
		
	

}
