package recursion;

public class DigitSum {
public static void main(String[] args) {
	int sum=sum(551);
	System.out.println("sum is "+sum);
	int summ=getSum(551);
	System.out.println("sum is "+summ);
	int x=5;
	int y=x%10;
	System.out.println(y);
}

public static int sum(int n)
{
	int sum=0;
	while(n>0)
	{
		int x=(n%10);
		sum +=x;
		n=n/10;
	}
	return sum;
}

public static int getSum(int n)
{
	
	if(n==0)
	{
		return 0;
	}
	else
	{
		return(n%10+getSum(n/10));
	}
	
	
	
}


}
