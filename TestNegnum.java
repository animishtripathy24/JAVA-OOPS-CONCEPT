import java.util.Scanner;
class NegativeNumberException extends Exception
{
	NegativeNumberException(String message)
	{
		super(message);
	}
}
class TestNegnum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int fact;
		System.out.println("Enter any value of n");
		int n = sc.nextInt();
		try
		{
			if(n<0)
			{
				throw new NegativeNumberException("You have entered negative number");
			}
			else
			{
				int i=1;
	            fact=1;
				while(i<=n)
				{
					fact=fact*i;
					i++;
				}
			}
			System.out.println("The Factorial of the number is "+fact);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("The program exited gracefully");
		
	}
}