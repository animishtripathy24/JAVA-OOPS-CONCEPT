import java.util.*;
import com.pune.PizzaHut.deliverable;

class Order implements deliverable
{
	private int orderNo;
	private String Date;
	private int cost;
	private String custName;
	private String custAddress;
	private int approxDistance;
	
	Order(int orderNo,String Date,int cost,String custName,String custAddress,int approxDistance)
	{
		this.orderNo=orderNo;
		this.Date=Date;
		this.cost=cost;
		this.custName=custName;
		this.custAddress=custAddress;
		this.approxDistance=approxDistance;
	}
	public boolean delivery()
	{
		if(approxDistance==deliveryAreaLimit)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
public class Reception
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Order Number: ");
		int orderNo=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Date:");
		String Date=sc.nextLine();
		System.out.println("Enter the Cost: ");
		int cost=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Customer Name :");
		String custName=sc.nextLine();
		System.out.println("Enter the Customer address :");
		String custAddress=sc.nextLine();
		System.out.println("Enter the approx distance :");
		int approxDistance=sc.nextInt();
		Order obj=new Order(orderNo,Date,cost,custName,custAddress,approxDistance);
		if(obj.delivery())
		{
			System.out.println("Your order is Deliverable !!!! ");
		}
		else
		{
			System.out.println("Home Delivery not available for this Distance");
			System.exit(0);
		}
	}
}
		
		