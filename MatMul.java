import java.util.Scanner;
class MatMul
{
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the order of matrix 1");
    int m=sc.nextInt();
    int n=sc.nextInt();
    int mat1[][]= new int[m][n];
    for(int i=0;i<m;i++)
    {
       for(int j=0;j<n;j++)
       {
          System.out.print("arr[" +(i+1)+"]["+(j+1)+"]=");
          mat1[i][j]=sc.nextInt();
       }
    }
    System.out.println("Enter the order of matrix 2\n");
    int l=sc.nextInt();
    int k=sc.nextInt();
    int mat2[][]=new int[l][k];
    for(int i=0;i<l;i++)
    {
       for(int j=0;j<k;j++)
       {
          System.out.print("arr[" +(i+1)+"]["+(j+1)+"]=");
          mat2[i][j]=sc.nextInt();
       }
    }
  
   if(n==l)
   {
      int ans[][]=new int[m][k];
      for(int i=0;i<m;i++)
      {
        for(int j=0;j<k;j++)
        {
           for(int t=0;t<n;t++)
           {
             ans[i][j]=ans[i][j]+mat1[i][t]*mat2[t][j];
           }
        }
     }
	  System.out.println("Product of matrix is ");

      for(int i=0;i<m;i++)
      {
        for(int j=0;j<k;j++)
        {
           System.out.print(ans[i][j]+" ");
        }
        System.out.print("\n");
	  }
	}
   else
   {
	   System.out.println("Matrix multiplication cannot be performed");
   }

  }
}