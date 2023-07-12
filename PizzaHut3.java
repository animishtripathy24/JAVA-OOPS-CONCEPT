import java.util.*;
class InvalidPizzaTypeException extends Exception
{
	InvalidPizzaTypeException(String message)
	{
		super(message);
	}
}
class InvalidPizzaSizeException extends Exception
{
	InvalidPizzaSizeException(String message)
	{
		super(message);
	}
}
class Pizza
{
	private String type;
	private String toppings;
	private String Name;
	private float time_of_preparation;
	private int cost_of_pizza;
	private String size;
	Pizza(String type,String toppings,String Name,String size)
	{
		this.type=type;
		this.toppings=toppings;
		this.Name=Name;
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
	void toString2()
	{
		System.out.println("\n. The type of the pizza is : "+type);
		System.out.println(". The toppings of the pizza is : "+toppings);
		System.out.println(". The name of the pizza is : "+Name);
		System.out.println(". The size of the pizza is : "+size);
	}
}
class CookThread extends Thread
{
	private String Name;
	private Pizza pizza;
	int total=0;
	public void run()
	{
		synchronized(this)
		{
			
			for(int i=1;i<=4;i++)
			{
				total+=5;
			}
		}
		try
		{
			this.notify();
		}
		catch(IllegalMonitorStateException e)
		{
			e.printStackTrace();
		}
	}

}
class WaiterThread extends Thread
{
	private String Name;
	private Pizza pizza;
	public void run()
	{
		System.out.println("Your pizza is serving");
	}

}
public class PizzaHut3
{
	public static void main(String[] args) throws InvalidPizzaTypeException,InvalidPizzaSizeException,InterruptedException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the type VEG or NON-VEG : ");
		String type=sc.nextLine();
		if(type.equals("veg") || type.equals("non-veg") || type.equals("non veg"))
		{
			System.out.println("Enter the size SMALL or MEDIUM : ");
			String size=sc.nextLine();
			if(size.equals("small") || size.equals("medium"))
			{
				System.out.println("YOU WANT TO ADD TOPPINGS :-> Enter YES or NO : ");
				String toppings=sc.nextLine();
				System.out.println("Enter the name of the pizza : ");
				String Name=sc.nextLine();
				Pizza obj = new Pizza(type,toppings,Name,size);
				obj.toString2();
			}
			else
			{
				throw new InvalidPizzaSizeException("Invalid Pizza Size!!!");
			}

		}
		else
		{
			throw new InvalidPizzaTypeException("Invalid Pizza Type!!!");
		}
		//multithreading
		CookThread ct=new CookThread();
		ct.start();
		synchronized(ct)
		{
			ct.wait();
			System.out.println("The Total Time Taken for Pizza Preparation is:"+ct.total);
			try
			{
				//delay for 5 second
				Thread.sleep(5000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		WaiterThread wt=new WaiterThread();
		wt.start();
	}
		
	
}