import java.util.Scanner;
public class Third {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		char ch=sc.nextLine().charAt(0);
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
