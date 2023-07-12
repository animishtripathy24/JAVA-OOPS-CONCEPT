import java.util.*;
class BillNotFoundException extends Exception
{
	BillNotFoundException(String message)
	{
		super(message);
	}
}
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
class Bill
{
	private int billNo;
	private String custName;
	private String Date;
	private int total;
	String[] items=new String[2];
	Bill(int billNo,String custName,String Date,int total)
	{
		this.billNo=billNo;
		this.custName=custName;
		this.Date=Date;
		this.total=total;
	}
	public void addItems(String[] arr)
	{
		items=arr;
	}
	public int getbillNo()
	{
		return billNo;
	}
	public String getcustName()
	{
		return custName;
	}
	public String getDate()
	{
		return Date;
	}
	public void setTotal(int uptotal) {
	    total=uptotal;
	}
	public int gettotal()
	{
		return total;
	}
}
class BillReports
{
	Scanner sc=new Scanner(System.in);
	Bill[] bills=new Bill[2];
	public void addBill()
	{
		for(int i=0;i<bills.length;i++)
		{
			System.out.println("Enter the Bill No : ");
			int billNo=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Customer Name :");
			String custName=sc.nextLine();
			System.out.println("Enter the Date : ");
			String Date=sc.nextLine();
			System.out.println("Enter the total : ");
			int total=sc.nextInt();
			bills[i]=new Bill(billNo,custName,Date,total);
		}
	}
	public Bill[] getBills()
	{
		return bills;
	}
	public void searchBill(int billno)
	{
		System.out.println("\nThe details of the given bill no are :-> "+bills[billno].getcustName()+"\t"+bills[billno].getDate()+"\t"+bills[billno].gettotal());
	}
	boolean updateBill(int upbillno,int uptotal)
	{
		if(((upbillno%bills.length)<bills.length))
		{
			bills[upbillno%bills.length].setTotal(uptotal);
			System.out.println("The new Total for Bill No"+(upbillno%bills.length)+" is : "+uptotal);
			return true;
		}
		else
		{
			return false;
		}
	}
		
		
	
}
public class Reports
{
	public static void main(String[] args) throws BillNotFoundException,InvalidPizzaTypeException,InvalidPizzaSizeException
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
				System.out.println("Enter the time of preparation : ");
				float time_of_preparation=sc.nextFloat();
				ItalianPizza obj = new ItalianPizza(type,toppings,Name,time_of_preparation,size);
				obj.calculateCost();
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
		String[] items=new String[2];
		for(int i=0;i<items.length;i++)
		{
			System.out.println("Enter the items "+(i+1));
			items[i]=sc.next();
		}
		Bill obj1=new Bill(0, "0", "0", 0);
		obj1.addItems(items);
		BillReports obj=new BillReports();
		obj.addBill();
		Bill[] arr=obj.getBills();
		System.out.println("The required details are : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("\t"+arr[i].getbillNo()+"\t"+arr[i].getcustName()+"\t"+arr[i].getDate()+"\t"+arr[i].gettotal()+"\n");
		}
		System.out.println("Enter the Bill No to be searched : ");
		int upbillNo=sc.nextInt();
		System.out.println("Enter the updated amount : ");
		int uptotal=sc.nextInt();
		if(obj.updateBill(upbillNo, uptotal))
		{
			obj.searchBill((upbillNo%arr.length));
		}
		else
		{
			throw new BillNotFoundException("Invalid Bill No !!!");
		}
	}
}