class  inherit1
{
	int i;
	char j;
   
   public inherit1(int  i,char j)
	{
		this.i=i;
		this.j=j;
	}


}

class inherit2 extends inherit1
{
	double k;
	
	public inherit2(double k,int i,char j)

		
	{
		super(i,j);
		this.k=k;
		
	}


   public void display()
   {
	System.out.println(this.i);
	System.out.println(this.j);
	System.out.println(this.k);
   }

}	