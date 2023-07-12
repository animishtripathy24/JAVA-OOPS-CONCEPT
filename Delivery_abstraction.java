import java.util.*;
abstract class Pizza
{
	private String type;
	private String toppings;
	private String Name;
	private float time_of_preparation;
	private int cost_of_pizza;
	private String size;
	Pizza(String type,String toppings,String Name,float time_of_preparation,String size)
	{
		this.type=type;
		this.toppings=toppings;
		this.Name=Name;
		this.time_of_preparation=time_of_preparation;
		this.size=size;
	}
	public String gettype()
	{
		return type;
	}
	public String gettoppings()
	{
		return toppings;
	}
	public String getsize()
	{
		return size;
	}
	public void setCost(int cost)
	{
		cost_of_pizza+=cost;
	}
	abstract void calculateCost();
	void toString2()
	{
		System.out.println("\n. The type of the pizza is : "+type);
		System.out.println(". The toppings of the pizza is : "+toppings);
		System.out.println(". The name of the pizza is : "+Name);
		System.out.println(". The time of preparation of the pizza is : "+time_of_preparation);
		System.out.println(". The total cost of the pizza is : "+cost_of_pizza);
		System.out.println(". The size of the pizza is : "+size);
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
		if(super.gettype().equals("veg") && super.getsize().equals("small") && super.gettoppings().equals("no"))
		{
			super.setCost(200);
		}
		else if(super.gettype().equals("veg") && super.getsize().equals("small") && super.gettoppings().equals("yes"))
		{
			super.setCost(230);
		}
		else if(super.gettype().equals("veg") && super.getsize().equals("medium") && super.gettoppings().equals("no"))
		{
			super.setCost(350);
		}
		else if(super.gettype().equals("veg") && super.getsize().equals("medium") && super.gettoppings().equals("yes"))
		{
			super.setCost(380);
		}
		else if(super.gettype().equals("non-veg") && super.getsize().equals("small") && super.gettoppings().equals("no"))
		{
			super.setCost(270);
		}
		else if(super.gettype().equals("non-veg") && super.getsize().equals("small") && super.gettoppings().equals("yes"))
		{
			super.setCost(300);
		}
		else if(super.gettype().equals("non-veg") && super.getsize().equals("medium") && super.gettoppings().equals("no"))
		{
			super.setCost(420);
		}
		else
		{
			super.setCost(450);
		}
	}
	void toString2()
	{
		super.toString2();
	}
}
class Delivery_abstraction
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the type VEG or NON-VEG : ");
		String type=sc.next();
		sc.nextLine();
		System.out.println("Enter the size SMALL or MEDIUM : ");
		String size=sc.nextLine();
		System.out.println("YOU WANT TO ADD TOPPINGS :-> Enter YES or NO : ");
		String toppings=sc.nextLine();
		System.out.println("Enter the name of the pizza : ");
		String Name=sc.nextLine();
		System.out.println("Enter the time of preparation : ");
		float time_of_preparation=sc.nextFloat();
		ItalianPizza obj = new ItalianPizza(type,toppings,Name,time_of_preparation,size);
		obj.calculateCost();
		obj.toString2();
	}
}