interface  A   //interface class
{
	public  void B();    //interface method with no body

	public void C();        //regular method with no body 
}  

 class D implements A
 {
	 public void B()
	 {
		 System.out.println(" inherited the interface class B method");     //interface method with body
	 }
	 public void C()
	 {
		 System.out.println(" inherited the interface class C method");     //interface method with body
	 }

 }

class main1
{

	public static void main(String[] args) 
	{
		D d1=new D();
		d1.B();
		d1.C();
	}

}