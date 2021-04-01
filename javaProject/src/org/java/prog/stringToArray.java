import java.util.Arrays;
class stringToArray
{
	public static void main(String[] args) 
	{
		String s="I am from Rajahmundry";
        String word=" ";

		int count = 0;
		String[]words=new String[4] ;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			word = word + ch;
			if(ch==' ')
			{
				words[count]=word;
				word=" ";
				count++;
			}
			//System.out.print(words[count]);
		}
		words[count]=word;
		System.out.println(Arrays.toString(words));

		
	}
}