import java.util.Scanner;
class Sequence
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n\n");
		int n=sc.nextInt();
		float sum = 0;
		for(int i=1;i<=n;i++)
		{
			sum = sum +(1/(float)i);
		}
		System.out.println("The sum of the harmonic sequence is-- "+sum);
	}
}
		
			