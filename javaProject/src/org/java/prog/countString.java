import java.util.*;
class  countString
{
	public static void main(String[] args) 
	{
       Scanner sc=new Scanner(System.in);
	   System.out.println("give input string");
	   String s =sc.next();

	 int vowelscount=getCount(s);
      int constcount=s.length()-vowelscount;
       System.out.print("consonents count" +constcount+ "vowelscount " +vowelscount);
	}
	public static int getCount(String s)
	{
		int vcount=0;
		int v=0;
		//String word=" ";
		//String cons =new String[10];
		//String vowel=new String[10];
		for(int i=0;i<s.length();i++)
		{
			     //word=word+i;
				 char ch=s.charAt(i);

			if((ch=='a')|(ch=='e')|(ch=='i')|(ch=='o')|(ch=='u'))
			{
                   // vowel[count]=word;
					 v=vcount++;
					
			}
		/*	else 
			{
				
				//cons[count]=word;
				count++;
			}*/
		}
		return v;
		//return vowels;


	}
}
