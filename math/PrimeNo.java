package math;

public class PrimeNo {
public static void main(String[] args) {
	boolean res=prime(2);
	System.out.println(res);
	boolean res1=effiPrime(1031);
	System.out.println(res1);
}

public static boolean prime(int N)
{
	boolean isPrime=false;
	if(N==1||N==0) 
	{
		isPrime= false;
	}else if(N==2)
	{
		isPrime= true;
	}else
	{
		for(int i=2;i<N;i++)
		{
			if(N%i==0)
			{
				isPrime= false;
			}else
			{
				isPrime= true;
			} 
		}
	}
	return isPrime;
}
//MOost efficient way O Square root of n
public static boolean effiPrime(int N)
{
	boolean isPrime=false;
	
	if(N==0||N==1)
	{
		isPrime=false;
	}else if(N==2||N==3) 
	{
		isPrime=true;
	}else
	{
		
	for(int i=5;i*i<N;i=i+6)	
	{
		if(N%i==0||N%(i+2)==0)
		{
			isPrime=false;
		}else
		{
			isPrime=true;
		}
	}
		
		
	}
	return isPrime;
}


}
