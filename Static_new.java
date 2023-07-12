import java.util.*;
class Customer
{
	private static int billNo; //static variable of int datatype by default the value is initialised to 0 
	Customer()
	{
		Customer.billNo++;
	}
	public static void printBillNo() //static method
	{
		System.out.println("\n"+"BillNo:"+billNo+"\n");
	}
	public int getBillNo()
	{
		return billNo;
	}
}
public class Static_new
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Date:");
		String Date=sc.next();
		System.out.println("Enter the customer Name:");
		String custName=sc.next();
		System.out.println("Enter the customer Address:");
		String custAddr=sc.next();
		Customer obj=new Customer();
		obj.printBillNo();
		int BillNo=obj.getBillNo();
		System.out.println("BillNo: "+BillNo+"\t\t"+"Date: "+Date+"\n\n"+"Customer: "+custName+"\n"+"Address "+custAddr);
		
		//now if we are creating another object of customer class the value of billno can be automatically incremented by 1
		Customer obj1=new Customer();
		obj1.printBillNo();
		int BillNo1=obj.getBillNo();
		System.out.println("\n\n"+"BillNo: "+BillNo1+"\t\t"+"Date: "+Date+"\n\n"+"Customer: "+custName+"\n"+"Address "+custAddr);
		
	}
}
