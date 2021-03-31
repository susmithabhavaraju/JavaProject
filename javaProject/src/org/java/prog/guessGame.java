package org.java.prog;
import java.util.*;
class guessGame 
{
	public static void main(String[] args) 
	{
		while (true)
		{
		 System.out.println("Welcome to the Guess Game.. ");
		 System.out.println("Guess the number from 1 to 1000.. ");
		
		Random rand =new Random();
        int rand_dub1 = rand.nextInt(1000); 
			//System.out.println(rand_dub1);
			int N=rand_dub1;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number");
			int Num=sc.nextInt();
			//String S="";
		
	
        while(true)
		{
		if(N==Num)
			{
				System.out.println("you have won");
				break;
			}


			else {
				//System.out.println("try the other number");
			String Msg=getNumber(Num,N);
			System.out.println(Msg);
			Num=sc.nextInt();

			}
		}
		

			System.out.println("Press Y to play again...?? Any other character to Quit " );
			
			String rply =sc.next() ;
			if(!rply.equals ("y") && (!rply.equals("Y")) )
			{
				break;
			}
		
		
		}
	}


		public static String getNumber(int Num,int N)
		{
			String S="";
			if(Num<N)
			{
				System.out.println("the number should be greater");
			}
		  else if(Num>N)
			  {
			System.out.println("the number should be lessthan the guessing number");
		      }
			
			else
			{
				System.out.println("your guess is right");
			}

			return S;
		}
	
}
