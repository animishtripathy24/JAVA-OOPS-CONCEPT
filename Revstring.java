import java.util.Scanner;
public class Revstring
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		char arr[] =new char[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.next().charAt(0);
		}
		System.out.printf("The string before reversing is:-\n");
		for(int i=0;i<n;i++)
		{
			System.out.print('' ''+arr[i]);
		}		
		int len =arr.length;
		int start=0;
		int end = len-1;
		while(start<=end)
		{
			char temp = arr[start];
			arr[start]=arr[end];
			arr[end] =temp;
			start++;
			end--;
		}
		System.out.printf("\nThe string after reversing is:-\n");
		for(int i=0;i<n;i++)
		{
			System.out.print(''\t''+arr[i]);
		}		
	}
}
		
		