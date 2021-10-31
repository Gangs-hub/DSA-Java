package math;

public class CountDIgits {
public static void main(String[] args) {
	int res=countDig(123);
	int res1=countRec(1000);
	int res2=counrLog(1022666);
	System.out.println(res);
	System.out.println(res1);
	System.out.println(res2);
}

public static int countDig(int N)
{
	int count=0;
    while(N!=0)
    {
    N=N/10;
    count++;
    }
	return count;
}
//Recurssive
public static int countRec(int N) {
	if(N==0) 
	{
	return 0;	
	}else
	{
		return 1+countRec(N/10);
	}
	
}
public static int counrLog(long N)
{
	return  (int) (Math.log10(N)+1);
}
	
}
