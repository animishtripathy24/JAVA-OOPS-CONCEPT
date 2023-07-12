import java.util.*;
class StringTokenizer
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
		System.out.println("The sum is: "+sum);
	}
}