class Fruit
{
	String name="Guava";
	String taste ="Good";
	String size ="Small";
	void eat()
	{
		System.out.println("The name of the fruit is"+name+" and the taste of the fruit is"+taste);
	}
		
}
class Apple extends Fruit
{
	String name="Apple";
	String taste ="very good";
	String size ="large";
	void eat()
	{
		System.out.println("The name of the fruit is"+name+" and the taste of the fruit is"+taste);
	}
}
class Orange extends Fruit
{
	String name="Orange";
	String taste ="Excellent";
	String size ="large";
	void eat()
	{
		System.out.println("The name of the fruit is"+name+" and the taste of the fruit is"+taste);
	}
}
public class Hierarchy
{
		public static void main(String args[])
		{
			Fruit fr=new Fruit();
			Apple ap =new Apple();
			Orange or =new Orange();
			fr.eat();
			ap.eat();
			or.eat();
		}
}

	