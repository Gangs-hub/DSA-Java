package arrays;

public class LargestElement {
public static void main(String[] args) {
	
	int[]arr= {1,2,13,15,4,6};
	
	int intLarge=0;
	
	for(int i=1;i<arr.length;i++)
	{
		if(arr[i]>arr[intLarge])
		{
			intLarge=i;
		}
		
	}
	System.out.println(intLarge);
	
	
}
}
