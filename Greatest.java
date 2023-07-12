import java.util.Scanner;
public class Greatest
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.printf("the greatest among three numbers is:\t%d",a);
			}
			else
			{
				System.out.printf("the greatest among three numbers is:\t%d",c);
			}
		}
		else
		{
			if(b>c)
			{
				System.out.printf("the greatest among three numbers is:\t%d",b);
			}
			else
			{
				System.out.printf("the greatest among three numbers is:\t%d",c);
			}
		}
	}
}
						
