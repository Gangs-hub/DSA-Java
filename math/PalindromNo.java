package math;

public class PalindromNo {
public static void main(String[] args) {

	boolean res=pan(7007);
	System.out.println("final res "+res);
	
	
	
}

public static boolean pan(int N)
{
	boolean isPanlindrom=false;
	int temp=N;
	int res=0;
	while(temp!=0)
	{
		int ld=temp%10;
		res=10*res+ld;
		System.out.println("res is "+res);
		temp=temp/10;
		System.out.println("temp is "+temp);
		
	}
	System.out.println("here temp is "+temp);
	if(res==N) {
		isPanlindrom=true;
		System.out.println("Ans"+isPanlindrom);
	}
	
	
	return isPanlindrom;
}
}
