import java.util.*;
class Pizza
{
	String type;
	String toppings;
	String Name;
	float time_of_preparation;
	Pizza(String type,String toppings,String Name,float time_of_preparation)
	{
		this.type=type;
		this.toppings=toppings;
		this.Name=Name;
		this.time_of_preparation=time_of_preparation;
	}
	public void toString1()
	{
		System.out.println("The type of the pizza is "+type+"\n"+"The toppings of the pizza is "+toppings+"\n"+"The name of the pizza is "+Name+"\n"+"The Time of preparation of the pizza is "+time_of_preparation+"\n");
	}
}
class ItalianPizza extends Pizza
{
	ItalianPizza(String type,String toppings,String Name,float time_of_preparation)
	{
		super(type,toppings,Name,time_of_preparation);
	}
	public void toString1()
	{
		super.toString1();
	}
}

class MexicanPizza extends Pizza
{
	MexicanPizza(String type,String toppings,String Name,float time_of_preparation)
	{
		super(type,toppings,Name,time_of_preparation);
	}
	public void toString1()
	{
		super.toString1();
	}
}	

class PizzaHut1
{
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the choice: italian or Mexican");
			String choice=sc.next();
			if(choice.equals("italian"))
			{
				System.out.println("Enter the type of Pizza either veg or non-veg");
				String type=sc.next();
				if((type.equals("veg")) || (type.equals("non-veg")))
				{
					System.out.println("Enter the toppings of pizza either mushroom,olive or no");
					String toppings=sc.next();
					System.out.println("Enter the Name either italian or mexican");
					String Name=sc.next();
					System.out.println("Enter the time of preparation");
					float time_of_preparation=sc.nextFloat();
					ItalianPizza obj= new ItalianPizza(type,toppings,Name,time_of_preparation);
					obj.toString1();
				}
				else
				{
					System.out.println("Invalid type");
					System.exit(0);
				}

			}
			else
			{
				System.out.println("Enter the type of Pizza either veg or non-veg");
				String type=sc.next();
				if((type.equals("veg")) || (type.equals("non-veg")))
				{
					System.out.println("Enter the toppings of pizza either mushroom,olive or no");
					String toppings=sc.next();
					System.out.println("Enter the Name either italian or mexican");
					String Name=sc.next();
					System.out.println("Enter the time of preparation");
					float time_of_preparation=sc.nextFloat();
					ItalianPizza obj= new ItalianPizza(type,toppings,Name,time_of_preparation);
					obj.toString1();
				}
				else
				{
					System.out.println("Invalid type");
					System.exit(0);
				}
			}	
		}
}
		
