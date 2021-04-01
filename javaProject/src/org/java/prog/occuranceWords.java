import java.util.Arrays;
class occuranceWords 
{
	public static void main(String[] args) 
	{
		String S="india is my country i love india";
		String input[] =stringToWords(S);
		//System.out.println(Arrays.toString(input));
		//int occurancecount=0;

		for(int k=0;k<input.length;k++)
		{
			int occurancecount=0;
			

			for(int j=k+1;j<input.length;j++)
			{
				System.out.println(input[k]+"--"+input[j]);
				if(input[k].equals(input[j]))
				{
					occurancecount+=1;
					System.out.println("the count of the repeated word"+occurancecount+"and the word is"+input[k]);
				}
			}
		}
	}

	public static String[] stringToWords(String S)
	{
		String word="";
		String[]words=new String[7];
		int count=0;
		for(int i=0;i<S.length();i++)
		{
			char ch=S.charAt(i);
			word=word+ch;

			if(ch==' ')
			{
				words[count]=word.trim();
				word="";
				count++;
			}

		}
		words[count]=word;
		return words;
	}
}



