import java.util.Scanner;
public class Fiveth {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		int flag=0;
		while(n>0)
		{
			int rem=n%10;
		    sum =sum +rem;
			n=n/10;
		}
		System.out.printf("the sum is %d",sum);
	    for(int i=2;i<sum;i++)
	    {
	        if(n%i==0)
	        {
	            flag=1;
	            break;
	        }
	    }
	    if(flag==1)
	    {
	    	System.out.println("\nit is not a prime number");
	    }
	    else
	    {
	    	System.out.println("\nit is a prime number");
	    }
		
	}

}