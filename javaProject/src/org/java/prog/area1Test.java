class area1Test 
{
	public static void main(String[] args) 
	{
		area1 a=new area1();
		a.length=12;
		a.breadth=10;
		
		area1 a2=new area1();
		a2.lengthvalue(15);
		a2.breadthvalue(12);

		a.calArea();
		a2.calArea();
		a.printAreaOfRectangle();
		a2.printAreaOfRectangle();

		area1.areaStatic();
	
	}
}
