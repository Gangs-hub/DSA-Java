package math;

public class NumberDivisor {
	
	public static void main(String[] args) {
		
		div(15);
		div1(15);
		div2(15);
	}




public static void div(int n)
{
	for(int i=1;i<=n;i++)
	{
		if(n%i==0)
		System.out.print(" "+i);
	}
		
	System.out.println();	
		
}
//Better solution o(square root of n)

public static void div1(int n)
{
	for(int i=1;i*i<=n;i++)
	{
		if(n%i==0)
		{
			System.out.print(" "+i);
			
			if(i!=n/i) //to avod printing 5*5 again and again:
			{
			System.out.print(" "+n/i);	//to print 25 here 
			}
			
		}
		
	}
		
	System.out.println();	
		
}
	
public static void div2(int n)
{
	int i;
	
	for(i=1;i*i<n;i++)
	{
		if(n%i==0)
		{
			System.out.print(" "+i);
		}
	}
	
	
	//System.out.println("i is here "+i);
	for( ;i>=1;i--)
	{
		if(n%i==0) 
		{
		System.out.print(" "+n/i);
		}
	}
	
}



}