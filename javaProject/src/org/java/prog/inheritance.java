class parent 
{

	public void parentMethod()
	{
		System.out.println("this is parent class");
	}
}

class child extends parent
{
	public void childMethod()
	{
		System.out.println("this is child class");
	}

}

class  inheritance
{

	public static void main(String[] args) 
	{
		parent p=new parent();
		child c=new child();
		c.childMethod();
		p.parentMethod();
		c.parentMethod();
	}
}
