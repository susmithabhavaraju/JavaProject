import java.util.*;
class palindromeString 
{
	public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.next();
		String givenstring=s;
		String str="";
		
        for(int i=s.length()-1;i>=0;i--)
		{ 
			char y=s.charAt(i);
			//System.out.println(y);
				str=str+y;
		}

		String resp=isPalindrome(givenstring,str);
		System.out.println(resp);

	}
		public static String isPalindrome(String G,String Rev)
	{
			String resp="";

			if(G.equals(Rev))
			{
				System.out.println("given string is palindrome");
			}
			else
			{
				System.out.println("given string is not palindrome");
			}

			return resp;
	}	
}
