package math;
import java.util.*;
public class SieveOfErastoness {
	//count of prime nos up to given nos ex:13>>2 3 7 13
public static void main(String[] args) {
	primeFcats(18);
	
}


public boolean primeNo(int n)
{
	boolean isPrime=false;
	if(n==0||n==1)
	{
		isPrime=false;
	}else if(n==2||n==3)
	{
		isPrime=true;
	}
	else
	{
		for(int i=5;i*i<=n;i=i+6)
		{
			if(n%i==0||n%(i+2)==0)
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
public static void primeFcats(int n)
{
	
	boolean []isPrime=new boolean[n+1];
	//filled whole array with true
	Arrays.fill(isPrime, true);
	System.out.println(Arrays.toString(isPrime));
	
	for(int i=2;i*i<=n;i++)
	{
		
		if(isPrime[i]) //if it is true
		{
			for(int j=2*i;j<=n;j=j+i)//multiples of(i) 2 3 4 5 etc
			{
				
				isPrime[j]=false;
				
				
			}
		}
		
	}
	
	for(int i=2;i<n+1;i++)
	{
		if(isPrime[i]==true)
		{
			System.out.print(" "+i);
		}
	}
	
	
	
}




}