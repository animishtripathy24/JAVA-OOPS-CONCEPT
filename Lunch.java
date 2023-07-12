import java.util.Scanner;
interface Juicy
{
	void squeeze();
	void drink();
}
class Fruit implements Juicy
{
	public void squeeze()
	{
		System.out.println("Juice Ready");
	}
	public void drink()
	{
		System.out.println("Have a nice drink");
	}
}
class Lunch
{
	public static void main(String args[])
	{
		Fruit fb = new Fruit();
	    fb.squeeze();
	    fb.drink();
	}
}

		
