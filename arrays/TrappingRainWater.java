package arrays;

import java.util.Arrays;

public class TrappingRainWater {
public static void main(String[] args) 
{
	//rain();
	raintrap();
}
//Theta n^2 time complexity Auxilary space theta 1;
public static void rain()
{
	int[]arr= {3,0,1,2,5}; //6
	int size=arr.length;
	int res=0;
	for(int i=1;i<size-1;i++)
	{
		int lmax=arr[i];
		for(int j=0;j<i;j++)
		{
			lmax=Math.max(lmax, arr[j]);
		}
		int rmax=arr[i];
		for(int k=i+1;k<size;k++)
		{
			rmax=Math.max(rmax, arr[k]);
		}
		res+= Math.min(lmax, rmax)-arr[i];
			
	}
	System.out.println(res);
	
}//Effecient theta of N only
public static void raintrap()
{
	int[]arr= {5,0,6,2,3}; //6
	int size=arr.length;
	//calculate left most for each elements
	int[]lmaxArray=new int[size];
	int[]rmaxArray=new int[size];
	int res=0;
	lmaxArray[0]=arr[0];
	for(int i=1;i<size;i++)
	{
		lmaxArray[i]=Math.max(arr[i], lmaxArray[i-1]);
		//5 5 6 6 3 
		//0 1 2 3 4
	}
	System.out.println(Arrays.toString(lmaxArray));
	
	rmaxArray[size-1]=arr[size-1];
	
	for(int i=size-2;i>=0;i--)
	{
		rmaxArray[i]=Math.max(arr[i], rmaxArray[i+1]);
	}
	
	
	
	System.out.println(Arrays.toString(rmaxArray));
	for(int i=1;i<size-1;i++)
	{
		res+=Math.min(rmaxArray[i], lmaxArray[i])-arr[i];
	}
	System.out.println(res);
	
}


}
