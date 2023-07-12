import java.util.Scanner;

public class CheckRoots
{

	public static void main(String[] args) 
{
	double a,b,c,D;
	double r1,r2;
	Scanner sc=new Scanner(System.in);
	System.out.print("\nEnter the value of a\n");
	a=sc.nextDouble();
	System.out.print("\nEnter the value of b\n");
	b=sc.nextDouble();
	System.out.print("\nEnter the value of c\n");
	c=sc.nextDouble();
	D=b*b-4*a*c;
	if(D>0)
	{
		r1=(-b+Math.sqrt(D))/(2*a);
		r2=(-b-Math.sqrt(D))/(2*a);
		System.out.println("\nRoots are real and distinct "+r1+" and "+r2);
	}
	else if(D==0)
	{
		r1=(-b+Math.sqrt(D))/(2*a);
		r2=r1;
		System.out.println("\nRoots are real and equal "+r1+"and "+r2);
	}
	else
	{
		System.out.println("\nImaginary roots");
	}
}

}