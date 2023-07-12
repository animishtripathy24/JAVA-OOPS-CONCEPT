public class Rev2darr
{
	public static void main(String args[])
	{
		int[] mat =new int[4];
		/*taking input into the array*/
		for(int i=0;i<4;i++)
		{
			mat[i]=Integer.parseInt(args[i]);
		}
		System.out.println("The given array is:-");
		for(int i=0;i<2;i++)
		{
			System.out.print(mat[i]+"\t");
		}
		System.out.print("\n");
		for(int i=2;i<4;i++)
		{
			System.out.print(mat[i]+"\t");		
		}
		int start =0;
		int end = 3;
		while(start<=end)
		{
			int temp=mat[start];
			mat[start]=mat[end];
			mat[end]=temp;
			start++;
			end--;
		}
		System.out.print("\nthe reverse of the array is:\n");
		for(int i=0;i<2;i++)
		{
			System.out.print(mat[i]+"\t");
		}
		System.out.print("\n");
		for(int i=2;i<4;i++)
		{
			System.out.print(mat[i]+"\t");		
		}
	}	
}
		