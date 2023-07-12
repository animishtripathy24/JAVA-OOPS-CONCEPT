import java.util.*;

class Customer
{
	private int custNo;
	private String custName;
	private String custAddr;
	public void init(int custNo,String custName,String custAddr)
	{
		this.custNo=custNo;
		this.custName=custName;
		this.custAddr=custAddr;
	}
	public void display()
	{
		System.out.println("The customer number is "+custNo+" The custName is "+custName+" The customers Address is "+custAddr);
	}
}
public class First_new
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the customer Number");
		int custNo=sc.nextInt();
		System.out.println("Enter the customer Name");
		String custName=sc.next();
		System.out.println("Enter the customer Address");
		String custAddr=sc.next();
		Customer obj=new Customer();
		obj.init(custNo,custName,custAddr);
		obj.display();
	}
}
