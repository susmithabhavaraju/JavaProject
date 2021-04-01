import java.util.*;

class  findNum
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		int A[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};
		int A1[]=new int[7];//{1,4,7,10,13,16,19};
		int A2[]=new int[7];//{2,5,8,11,14,17,20};
		int A3[]=new int[7];//{3,6,9,12,15,18,21};
		int result[]=new int[21];
/*		for(int j=0;j<=2;j++)
		{
		  for(int i=0;i<A.length;i++)
		{   
			  if(A[i]==n)
			{ 
                 y=n;
				  break;
			}   
	   }


	       System.out.println(y);
		}
           if(S[12]==n)
		{
			   System.out.println(s[12]);
		}
*/
	for(int j=0;j<=2;j++)
		{
	int count=0;
	for (int i =0;i<A.length;i=i+3)
	{
		//System.out.println(i);
	
		A1[count]= A[i];
		A2[count] = A[i+1];
		A3[count] = A[i+2];
		count = count +1;
	}
	
	System.out.println("Group1 - " + Arrays.toString(A1));
	System.out.println("Group2 - " + Arrays.toString(A2));
	System.out.println("Group3 - " + Arrays.toString(A3));
	System.out.println("enter the group number");
	int S=sc.nextInt();
	if(S==1)
		{
			result = new int[21]; 
			System.arraycopy(A2, 0, result,0,7);  
			System.arraycopy(A1, 0, result,7,7);  
			System.arraycopy(A3, 0, result,14,7);  

			 System.out.println(Arrays.toString(result));    

		}
	  else if(S==2)
			{
			      result = new int[21];
				  System.arraycopy(A1,0,result,0,7);
				  System.arraycopy(A2,0,result,7,7);
				  System.arraycopy(A3,0,result,14,7);

				  //System.out.println(Arrays.toString(result));    

			}
		else if(S==3){
				 result = new int[21]; 
				 System.arraycopy(A2,0,result,0,7);
				 System.arraycopy(A3,0,result,7,7);
				 System.arraycopy(A1,0,result,14,7);

				// System.out.println(Arrays.toString(result));    
			     }
		else {
		System.out.println("Wrong Imput");
		}
		
		
				System.arraycopy(result,0,A,0,21);
				 //A[]=Arrays.copyOf(result,21);

		//System.out.println("A after copy " + Arrays.toString(A));    

		}
		
			  System.out.print(" the numberis"+ A[10]);

			
	}
}
