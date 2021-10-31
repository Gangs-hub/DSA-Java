package math;

public class TrailingZeros {
public static void main(String[] args) {
	
	int res=trailZeros(10);
	System.out.println(res);
	int res1=tailEfficient(251);
	System.out.println(res1);
}

public static int trailZeros(int N)
{
	int res=1;
	int noZero=0;
	for(int i=2;i<=N;i++)
	{
		res*=i;
	}
	System.out.println("Factorial is "+res);
	
		int temp=res;
		while(temp%10==0)//to get last digit
		{
			noZero++;
			temp=temp/10;//To remove one by one last digit
			
		}
		return noZero;
	
}
public static int tailEfficient(int N) {
	int res=0;
	for(int i=5;i<=N;i=i*5)
	{
		res=res+N/i;
	}
	return res;
}


}
