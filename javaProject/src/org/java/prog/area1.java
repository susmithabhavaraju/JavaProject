class area1
{
	int length;
	int breadth;
	double area;
	public  void lengthvalue(int len)
	{
		length=len;
	}
	public  void breadthvalue(int bre)
	{
		breadth=bre;
	}
	public  void calArea()
	{
		area=length*breadth;
	}
	public  void printAreaOfRectangle()
	{
		System.out.println("length"+ length);
		System.out.println("breadth"+ breadth);
		System.out.println("area of rectangle"+ area);
	}

	public static void areaStatic ()
	{
		System.out.println("IM AM STATIC CLASS IN A CLASS");

	}


}
