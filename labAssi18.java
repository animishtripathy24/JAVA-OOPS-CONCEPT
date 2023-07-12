import java.util.Scanner;
public class labAssi18
{
	public static void main(String args[])
	{
		try
		{
		  one();
		}
		catch(ArithmeticException e)
		{
			System.out.println("dividing by Zero"+e);
		}
	}
		static void one()throws ArithmeticException
	    {
			try
			{
		       int a=12,b=0;
		       two(a,b);
		    }
			catch(ArithmeticException e)
			{
				throw e;
			}
			
	    }
		static void two(int a,int b)
	    { 
			try{
				
		    int c=a/b;
			}
			catch(ArithmeticException e)
			{
				throw e;
			}
	    }
	}