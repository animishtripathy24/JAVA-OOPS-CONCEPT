class ClassTest
{
	public void draw()
	{
		System.out.println("Drawing Shape");
	}
	public void erase()
	{
		System.out.println("Erasing Shape");
	}
	public static void main(String args[])
	{
		ClassTest obj = new ClassTest();
		obj.draw();
		obj.erase();
	}
}
	