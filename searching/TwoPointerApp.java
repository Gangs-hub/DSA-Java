package searching;
//Two pointer approach 
public class TwoPointerApp {
public static void main(String[] args) {
	//int arr[]= {2,3,4,8,9,20,40};
	System.out.println("Heloo");
	int ans=isPair();
	System.out.println("result is "+ans);
	/*for(int i=0;i<arr.length;i++)
	{
		//boolean ans=
	}*/
}

public static int isPair()
{
	System.out.println("Called or not");

	//int arr[]= {2,3,4,8,9,20,40};//Sorted array
	int arr[]= {2,3,7,8,11};
	int n=arr.length;
	int x=14;
	int left=0,right=n-1;
	while(left<=right)
	{
		if(arr[right]+arr[left]==x)
		{
			return 1;
		}else if(arr[right]+arr[left]>x)
		{
			right--;
		}else
		{
			left++;
		}
		
	}
	return 0;
	
	//System.out.println("ARe u there!");
	
	
}

}
