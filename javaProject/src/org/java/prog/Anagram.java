import java.util.*;
class Anagram 
{
	public static void main(String[] args) 
	{
		//String s1 = "Naman";
		//String s2 = "vickghgcgfcggc";
		Scanner sc= new Scanner(System.in);
		String s1=sc.next();
		System.out.println("enter the first string");
		

		String s2=sc.next();
		System.out.println("enter the second string");

		char ch1,ch2;
		int count = 0;
		if(s1.length()==s2.length())
		  {
			System.out.println("two strings are of same length");
			
		
 			for(int i=0;i<s1.length();i++)
			{	
				 ch1=s1.charAt(i);
	
			  for(int j=0;j<s2.length();j++)
			    {

				 ch2=s2.charAt(j);

                     if(ch1==ch2)
					{
						count= count+1;		
						break;
					}
				
				 if (j==s2.length()-1)
				 {
				 System.out.println(" the given string is not an anagram");
				 System.exit(0); 
				 }
				}
			}
			if (count == s1.length())
			{
			 System.out.println(" the given string is an anagram");
			
			}

		  
		  }
		
			else
			{
				System.out.println(" the given string is not of same length");
			}

	}
}


			
	

