import java.util.*;
class Armstrong 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value");
	    int n=sc.nextInt();
        int ArmstrongSum=getArmstrong(n);
		System.out.println(ArmstrongSum);
	}
	public static int getArmstrong(int n)
	{
		
		int sum=0,rem=0;
		while(n>0)
		{
           rem=n%10;
		   sum=sum+rem*rem*rem;
		   n=n/10;

		}
		return sum;
	}
}
