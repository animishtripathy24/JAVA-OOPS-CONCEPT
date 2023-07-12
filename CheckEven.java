import java.util.Scanner;
public class CheckEven 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int n=sc.nextInt();
		System.out.println((n%2==0)?"It is an Even Number":"It is an Odd Number");
	}

}

