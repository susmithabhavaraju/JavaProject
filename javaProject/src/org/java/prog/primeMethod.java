import java.util.Arrays;
import java.util.*;
class  primeMethod
{
 
	public static void main(String[] args) 
	{
		

		Scanner sc=new Scanner(System.in);
	    System.out.println("enter the value");
        int n=sc.nextInt();

        int A[]=getPrimeNum(n);
        System.out.print(Arrays.toString(A));
		System.out.println("enter the value for prime num position ");
        int z=sc.nextInt();
		System.out.print(A[z]);
	}

	public static int[] getPrimeNum(int n)
	{
		
		int p[]=new int[10];
		int count=0;
		boolean prime;
		for(int i=20;i<=n;i++)
		{
			int y=i%2;

		     if(y==1)
			{
               prime=true;
                p[count]=i;
				count++;
				}		
		}
		//System.out.print(Arrays.toString(p));
		return p;
				
	}
}
