import java.util.*;
public class Account
{
	String acc_name,address,type_of_account;
	int acc_number;
	int current_balance;
	public Account(String acc_name,int acc_number,int initial_amount)//parameterized constructor
	{
		this.acc_name=acc_name;
		this.acc_number=acc_number;
		this.current_balance=initial_amount;
	}
	public Account( String name,int number,String address,String type,int balance)//parameterized constructor
	{
		acc_name=name;
		acc_number=number;
		this.address=address;
		type_of_account=type;
		current_balance=balance;
	}
	void deposit(int amount)
	{
		current_balance+=amount;
	}
	void withdraw(int amount)
	{
		current_balance-=amount;
	}
	int getbalance()
	{
		return current_balance;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Account a1=new Account("Animish",123456789,72000);
		Account a2=new Account("Tripathy",987654321,"BitPatna","Savings",60000);
		System.out.println("The current amount in the account is:"+a1.getbalance()+"\t"+a2.getbalance());
		System.out.println("Enter the amount to be deposited");
		int amount=sc.nextInt();
		a1.deposit(amount);
		a2.deposit(amount);
		System.out.println("The current amount in the account is:"+a1.getbalance()+"\t"+a2.getbalance());
		System.out.println("Enter the amount to be withdrawed");
		int amount_with=sc.nextInt();
		a1.withdraw(amount_with);
		a2.withdraw(amount_with);
                  System.out.println("The current amount in the account is:"+a1.getbalance()+"\t"+a2.getbalance());
		
		
	}
}
		
		
		
	
		
	