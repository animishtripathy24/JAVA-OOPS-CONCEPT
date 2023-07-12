public class Fourth {
	public static void main(String args[])
	{
		char ch = args[0].charAt(0);
		if(Character.isDigit(ch))
		{
			System.out.printf("It is an Digit\n");
		}
		else if(Character.isLetter(ch))
		{
			System.out.printf("It is an alpahabet\n");
		}
		else
		{
			System.out.print("It is a special Character\n");
		}
		
	}

}
