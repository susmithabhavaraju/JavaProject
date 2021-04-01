abstract class  A   //abstract class
{
	public abstract void B();    //abstract method with no body

	public void C()          //regular method
	{
		System.out.println(" regular method");
	}

}  

 class D extends A
 {
	 public void B()
	 {
		 System.out.println(" inherited the abstraction method");     //call the abstract method with body
	 }
 }

class main
{

	public static void main(String[] args) 
	{
		D d1=new D();
		d1.B();
		d1.C();
	}

}