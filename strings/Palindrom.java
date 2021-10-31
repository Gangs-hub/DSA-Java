package strings;

public class Palindrom {

	public static void main(String[] args) 
	{
		boolean res=false;
		String str="abba";
		StringBuilder builder=new StringBuilder(str);
		
		builder.reverse();
		String ok=builder.toString();
		System.out.println(ok);
		
		
		res=str.equals(builder.toString());
		
	//	System.out.println(res);
		
		boolean ress=isPal(str);
		System.out.println(ress);
	
	}
	//O(n) worst case theta n best case is theta 1
	//constant sapce can be represented by either big O 1 or theta 1
	public static boolean isPal(String str)
	{
		int begin=0;
		int end=str.length()-1;
		while(begin<end)
		{
			if(str.charAt(begin)!=(str.charAt(end)))
			{
			return false;
			}
			else
			{
					begin++;
					end--;
			}
			
		}
		return true;
		
	}

}
