class Animal
{
	void eat()
	{
		System.out.println("Animal eats different kinds of food");
	}
	 void sleep()
	{
		System.out.println("Animal are sleeping");
	}
}
class Bird extends Animal
{
	 void eat()
	{
		System.out.println("Birds are Eating");
	}
	 void sleep()
	{
		System.out.println("Birds are sleeping");
	}
	 void fly()
	{
		System.out.println("Birds are flying");
	}
}

public class Inheritance
{
	public static void main(String args[])
	{
		Bird ob=new Bird();
		Animal obj=new Animal();
		obj.eat();
		obj.sleep();
		ob.eat();
		ob.sleep();
		ob.fly();
	}
}
	
	
	
	