import java.util.Arrays;

class  RemainingString
{
	public static String[] StringtoWords(String S)
	{
      String word=" ";
	  String[]words=new String[50];
      int count=0;
	  for(int i=0;i<S.length();i++)
		{
		  char ch=S.charAt(i);

           
			if(ch==' ')
			{
				
				words[count]=word;
				word=" ";
				count++;
			}
			else {
			word = word + ch;
			}

		}
		words[count]=word;

		return words;
	}

	public static void main(String[] args) 
	{
		String s1="india is my country";
		String s2="i love india";
		String[] words1 = StringtoWords(s1);
		String[] words2 = StringtoWords(s2);
        String[] d = new String[13];
		int cnt=0;


		for(int i=0;i<words1.length;i++)
		{
			   for(int j=0;j<words2.length;j++)
			{
				   if(words1[i]!=null&&words2[j]!=null)
				{
				   if(words1[i].equals(words2[j]))
					{
                          System.out.println("hei");
						  words2[j] = null;
						  
					}
				}

			}
	

		
		}

		
 System.out.println(Arrays.toString(words1));		
System.out.println(Arrays.toString(words2));			
	}
}
