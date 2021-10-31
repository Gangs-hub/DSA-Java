package math;

public class PrimeFactors {
public static void main(String[] args) {
	primeFacto(12);
}

public static boolean Prime(int N)
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
	
		for(int i=5; i*i<N;i=i+6)
		{
			if(N%i==0 ||N%(i+2)==0)
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

public static void primeFacto(int N)
{

	for(int i=2;i<N;i++) 
	{
		if(Prime(i)) {
			
			int x=i;
			while(N%x==0)
			{
				System.out.print(" "+i);
				x=x*i;
			}
			
		}
		
	}
	
}

}
