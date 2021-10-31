package math;

public class HCF {
public static void main(String[] args) {
	int res=hcf(100,200);
	System.out.println(res);
	int res1=gcd(100,200);
	System.out.println(res1);
}

public static int hcf(int a,int b)
{
	int min=Math.min(a, b);
	int res=1;
	
	while(min>0)
	{
		if(a%min==0 && b%min==0)
		{
			res=min;
			break;
		}
		
		min--;
		
	}
	return res;
	
	
}
//Recursion by Eucliclean Algorithm:
public static int gcd(int a, int b)
{
	if(b==0)
	{
		return a;
	}else
	{
		return gcd(b,a%b);
	}
}

}
