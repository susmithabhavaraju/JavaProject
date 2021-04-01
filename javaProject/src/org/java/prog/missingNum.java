class missingNum 
{
	public static void main(String[] args) 
	{
		int sum=0,res=0,missednum=0;
		int A[]={10,11,13,14,15};
		for(int i=0;i<A.length;i++)
		{
			sum=sum+A[i];
		}
		for(int i=10;i<=15;i++)
		{
			res=res+i;
		}
		missednum=sum-res;
		System.out.println("num"+missednum);
	}
}


