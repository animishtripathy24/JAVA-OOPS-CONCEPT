import java.util.*;
class Customer
{
	private int custNo;
	private String custName;
	private String custAddr;
	public void setData(int custNo,String custName,String custAddr) // setter
	{
		this.custNo=custNo;
		this.custName=custName;
		this.custAddr=custAddr;
	}
	public int getCustNo() // getter
	{
		return custNo;
	}
	public String getCustName() // getter
	{
		return custName;
	}
	public String getCustAddr() // getter
	{
		return custAddr;
	}
}
public class Setter_getter
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
		obj.setData(custNo,custName,custAddr);
		System.out.println("The customer Number is: "+obj.getCustNo());
		System.out.println("The customer name is "+obj.getCustName());
		System.out.println("The customer Address is: "+obj.getCustAddr());
	}
}
