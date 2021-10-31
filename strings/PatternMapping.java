package strings;

public class PatternMapping 
{
public static void main(String[] args) 
{
	String txt="ABCEABEFABCD";
	String pt="ABCD";	
	
	//patt(txt,pt);
	pattEffi(txt,pt);
}
public static void patt(String text,String pattern)
{
	int textLeng=text.length();
	int pattLeng=pattern.length();
     int traversal=textLeng-pattLeng;
     
     for (int i = 0; i <=traversal; i++) 
     {
    	System.out.println("i Count "+i);
    	 int j;
		for ( j= 0; j < pattLeng; j++) 
		{
			System.out.println("j Count "+j);
		if(pattern.charAt(j)!=text.charAt(i+j))	
		{
			//System.out.println("times not similar");
		break;	
		}
		
		if(j==pattLeng-1)
		{
			System.out.println("ANS Count "+i);
		}
		
		}
		
	}
	
	
	
}

//improved neive algorithm >new video
public static void pattEffi(String text,String patt)
{
	int txtLeng=text.length();
	int pattLeng=patt.length();
	int transfer=txtLeng-pattLeng;
	
	for(int i=0;i<=transfer;)
	{
		int j;
		for(j=0;j<pattLeng;j++)
		{
		if(patt.charAt(j)!=text.charAt(i+j))
		{
			break;
		}
		
		if(j==pattLeng-1)
		{
			System.out.println("Count is in "+i);
		}
		
		
		
		}
		if(j==0)
		{
			i++;
		}
		else
		{
		i=i+j;	
		}
		
	}
	
}



}
