package strings;

public class SubsequenceOfOther {

	public static void main(String[] args) {

		String s1="ABCDEF";
		String s2="ADE";
		boolean ans=sub(s1,s2);
		System.out.println(ans);

	}
	public static boolean sub(String s1,String s2)
	{
		boolean res=false;
		int j=0;
		for(int i=0;i<s1.length()&&j<s2.length();i++)
		{
		if(s1.charAt(i)==s2.charAt(j))
		{
			j++;
		}
			}
		return j==s2.length();//if length matches then true or else false
	}
}
