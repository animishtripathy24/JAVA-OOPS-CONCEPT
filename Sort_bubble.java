import java.util.Scanner;

public class Sort_bubble {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter size of array");
		n=sc.nextInt();
		int mat[]=new int[n];
		System.out.println("Enter the elements in the array.");
		for(int i=0;i<n;i++)
		{
			System.out.print("A["+(i+1)+"]=:");
			mat[i]=sc.nextInt();
		}
		
		System.out.println("Array before bubble sort is:");
		displayarr(mat,n);
		bubbleSort(mat,n);
		System.out.println("Array after bubble sort is:");
		displayarr(mat,n);
	}
		static void bubbleSort(int arr[], int n)
	    {
	        int i, j, temp;
	        boolean check;
	        for (i = 0; i < n - 1; i++)
	        {
	            check = false;
	            for (j = 0; j < n - i - 1; j++)
	            {
	                if (arr[j] > arr[j + 1])
	                {
	                    temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                    check = true;
	                }
	            }
	            if (check == false)
	                break;
	        }
	    }
		
	static void displayarr(int arr[],int size)
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println("\n");
	}

}