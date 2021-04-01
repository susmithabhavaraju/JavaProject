import java.util.*;
class  reverseNum
{
	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the n value");
	  int n=sc.nextInt();
      int reverseNum=checkReverse(n);
	  System.out.println(reverseNum+" reverse of a number");
	}
	public static int checkReverse(int n)
	{
	      int rem=0,rev=0;
	      while(n>0)
	      {
	        	rem=n%10;
	        	rev=(rev*10)+rem;
	        	n=n/10;
	      }
		  return rev;
	}
}
