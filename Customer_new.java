import java.util.*;
class Customer
{
	private int custNo;
	private String custName;
	private String custAddr;
	Customer(int custNo,String custName,String custAddr)
	{
		this.custNo=custNo;
		this.custName=custName;
		this.custAddr=custAddr;
	}
	
}
class CustomerReport
{
	Scanner sc=new Scanner(System.in);
	Customer[] custList=new Customer[5];
	public void addCustomer()
	{
		for(int i=0;i<custList.length;i++)
		{
			System.out.println("Enter the Customer Number : ");
			int custNo=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Customer Name : ");
			String custName=sc.nextLine();
			System.out.println("Enter the Customer Address : ");
			String custAddr=sc.nextLine();
			custList[i]=new Customer(custNo,custName,custAddr);
		}
	}
	public void printList(Customer[] custList)
	{
		int custNo=Customer.getcustNo();
		String custName=Customer.getcustName();
		String custAddr=Customer.getcustAddr();
		System.out.println("\nThe details of the customers are :- "+"\n");
		for(int i=0;i<custList.length;i++)
		{
			System.out.println("\t"+custList[i].custNo+"\t"+custList[i].custName+"\t"+custList[i].custAddr+"\n");
		}
	}
}
public class Customer_new
{
	public static void main(String[] args)
	{
		CustomerReport obj=new CustomerReport();
		obj.addCustomer();
		obj.printList();
	}
}