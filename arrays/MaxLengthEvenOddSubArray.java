package arrays;

public class MaxLengthEvenOddSubArray {
public static void main(String[] args) {
	
	MaxLenth();
}
//Gangs you did it directly with O(n) cudos!!
public static void MaxLenth()
{
	//int[]arr= {10,12,14,7,8};
	int[]arr= {7,10,13,14};
	int res=1;
	int count=1;
	
	for(int i=0;i<arr.length-1;i++)
	{
		if(arr[i]%2==0 && arr[i+1]%2!=0 ||arr[i]%2!=0 && arr[i+1]%2==0)//even element
		{
			count++;
		}else  //odd element
		{
			res=0;
		}
		res=Math.max(res, count);
		
	}
	System.out.println(res);
	
}




}
