package math;

public class Factorial {
public static void main(String[] args) {
	int res=fact(5);
	System.out.println(res);
	int res1=factRec(5);
	System.out.println(res1);
}
public static int fact(int N)
{
	int res=1; //will cover 0!=1 and 1!=1
	for(int i=2;i<=N;i++)
	{
		res*=i;
	}
	return res;	
		
}
//Recursion method
public static int factRec(int N)
{
if(N==0||N==1)
{
	return 1;
}else
{
	return N* factRec(N-1);
}
	
	
}


}
