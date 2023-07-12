import java.util.*;
abstract class Pizza
{
	private String type;
	private String toppings;
	private String Name;
	private float time_of_preparation;
	private int cost_of_pizza=0;
	private String size;
	Pizza(String type,String toppings,String Name,float time_of_preparation,String size)
	{
		this.type=type;
		this.toppings=toppings;
		this.Name=Name;
		this.time_of_preparation=time_of_preparation;
		this.size=size;
	}
	abstract void calculateCost();
	void toString2()
	{
		System.out.println("The type of the pizza is "+type);
		System.out.println("The toppings of the pizza is "+toppings);
		System.out.println("The Name of the pizza is "+Name);
		System.out.println("The time_of_preparation of the pizza is "+time_of_preparation);
		System.out.println("The cost_of_pizza of the pizza is "+cost_of_pizza);
		System.out.println("The size of the pizza is "+size);
	}
	
}
class ItalianPizza extends Pizza
{
	ItalianPizza(String type,String toppings,String Name,float time_of_preparation,String size)
	{
		super(type,toppings,Name,time_of_preparation,size);
	}
	void calculateCost()
	{
		if(type.equals("veg") && size.equals("small") && toppings.equals("no"))
		{
			super.cost_of_pizza+=200;
		}
		else if(type.equals("veg") && size.equals("small") && toppings.equals("yes"))
		{
			super.cost_of_pizza+=230;
		}
		else if(type.equals("veg") && size.equals("medium") && toppings.equals("no"))
		{
			super.cost_of_pizza+=350;
		}
		else if(type.equals("veg") && size.equals("medium") && toppings.equals("yes"))
		{
			super.cost_of_pizza+=370;
		}
		else if(type.equals("nonveg") && size.equals("small") && toppings.equals("no"))
		{
			super.cost_of_pizza+=270;
		}
		else if(type.equals("nonveg") && size.equals("small") && toppings.equals("yes"))
		{
			super.cost_of_pizza+=300;
		}
		else if(type.equals("nonveg") && size.equals("medium") && toppings.equals("no"))
		{
			super.cost_of_pizza+=420;
		}
		else
		{
			super.cost_of_pizza=450;
		}
	}
	void toString2()
	{
		super.toString2();
	}
}
class Delivery_new
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the type VEG or NON-VEG");
		String type=sc.next();
		System.out.println("Enter the size SMALL or MEDIUM");
		String size=sc.next();
		System.out.println("YOU WANT TO ADD TOPPINGS:) Enter YES or NO");
		String toppings=sc.next();
		System.out.println("Enter the name of the pizza");
		String Name=sc.next();
		System.out.println("Enter the time_of_preparation");
		float time_of_preparation=sc.nextFloat();
		ItalianPizza obj = new ItalianPizza(type,toppings,Name,time_of_preparation,size);
		obj.calculateCost();
		obj.toString2();
	}
}
		
		
		
	
	
