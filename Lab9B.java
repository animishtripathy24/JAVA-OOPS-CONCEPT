class AgeException extends Exception
{
	AgeException(String message)
	{
		super(message);
	}
}



class Lab9B
{
	public static void main(String args[])
	{
			String name = args[0];
			int age = Integer.parseInt(args[1]);
		try
		{
			if(age>=18 && age<=60)
			{
				System.out.println("Name of the vanda is "+name+" and the age of the vanda is "+age);
			}
			else
			{
				throw new AgeException("You have entered the wrong age");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		System.out.println("The program exited gracefully");
	}
}
