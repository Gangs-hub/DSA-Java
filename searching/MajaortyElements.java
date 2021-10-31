package searching;

public class MajaortyElements {

	public static void main(String[] args) 
	{
		int arr[]= {8,7,6,8,6,6,6,6};
		int arr1[]= {6,8,4,8,8};
		int res=majorityelem(arr);
		//System.out.println("result is "+res);
		int res1=majorityelemEffi(arr1);
		System.out.println("result is "+res1);
	}
	
	//Nieve solution
	public static int majorityelem( int arr[])
	{
		int res=-1;
		int count=0;
		int N=arr.length;
		
		for(int i=0;i<N;i++)
		{
		count=1;
		for (int j = i+1; j < N; j++)
		{
			if(arr[i]==arr[j])
			{
				count++;
			}
		}
		if(count>N/2)
		{
			res= i;
		}
		}
		
		return res;
	}
	//O(n)Efficient sol:
	public static int majorityelemEffi( int arr[])
	{
		int res=0;
		int count=1;
		int N=arr.length;
		for (int i = 1; i < arr.length; i++) 
		{
			if(arr[res]==arr[i])
			{
				count++;
			}else
			{
				count--;
			}
			if(count==0)
			{
				res=i;
				count=1;
			}
		}
		System.out.println("Candiadte is "+arr[res]);
		count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[res]==arr[i])
			{
				count++;
			}
			
		}
		if(count<=N/2)
		{
			res=-1;
		}
		return res;
	}
	
}
