package math;

public class LCM {
public static void main(String[] args) {
	int res=lcm(4,6);
	System.out.println(res);
	int res2=gcdAlgo(4,6);
	System.out.println(res2);
}

public static int lcm(int a, int b) {
	
	int max=Math.max(a, b);
	int lcmNo=1;
	
	while(max>0) {
		
		if(max%a==0 && max%b==00) {
			return max;
		}
		max++;
	}
	return max;
	
}
//Effective way by Eucliclean Algorithm:
public static int gcdAlgo(int a ,int b)
{
	return (a*b)/lcmNormal(b,a%b);
	
	
	
	
}

public static int lcmNormal(int a,int b)
{
	if(b==0) {
		return a;
	}else {
		return lcmNormal(b,a%b);
	}
}



}
