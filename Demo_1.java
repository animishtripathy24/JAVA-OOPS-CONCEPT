import java.util.Scanner;
import java.util.StringTokenizer;
public class Demo_1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringTokenizer res = new StringTokenizer(str);
		int sum =0;
		while (res.hasMoreTokens())   
        {    
            int x=Integer.parseInt(res.nextToken());
			System.out.print("\t"+x);
			sum+=x;
        }
		System.out.println("\nThe sum is: "+sum);
	}
}