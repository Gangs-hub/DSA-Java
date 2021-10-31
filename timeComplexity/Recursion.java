package timeComplexity;

public class Recursion {
	
	public static int fun(int N)
	{
		
		if(N==0||N==1)  {
		return 0;
		}else {
		
		
			 
			int  a=0,b=1, c=1;
		for(int i=2;i<=N;i++)
		{
			
			c=a+b;
			System.out.println("inside c"+c);
			a=b;
			System.out.println("inside a"+a);
			b=c;	
			System.out.println("inside b"+b);
		}
		return c;
		}
	}
		
	
	
		
public static void main(String[] args) {
    int num=fun(5);	
	System.out.println(num);
	
}//method
}//class
