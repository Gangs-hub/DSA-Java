package arrays;

public class LeaderInArray {
public static void main(String[] args) {

	//leader();
	leaderN();
	
}

public static void leader() {
	int[]arr= {7,10,4,10,6,5,2};
	boolean flag=false;
	
	for(int i=0;i<arr.length;i++)
	{
		flag=true;
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[j]>=arr[i])
			{
				//no is not leader
				flag=false;
				break;
			}
		}
		if(flag==true) {
		System.out.print(" "+arr[i]);
		}
	}
	
	
}

public static void leaderN()
{
	int[]arr= {7,10,4,10,6,5,2};
	int size=arr.length;
	int leader=arr[size-1];
	System.out.print(" "+leader);
	for(int i=size-2;i>=0;i--)
	{
		if(arr[i]>leader)
		{
		leader=arr[i];
		System.out.print(" "+leader);
		
		}
	}
	
}

}
