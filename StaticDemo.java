class StaticDemo1
{
	static int a=10;
	static void display()
	{
		System.out.println("STATIC METHOD");
	}
	static
	{
		System.out.println("STATIC BLOCK");
	}
public class StaticDemo
{

	public static void main(String args[])
	{
		System.out.println(a);
		display();
	}
}
}
		
	