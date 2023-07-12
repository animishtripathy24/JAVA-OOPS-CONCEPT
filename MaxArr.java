import java.util.Scanner;
public class MaxArr
{
   public static void main(String args[])
   {
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter the size of the array");
      int n=sc.nextInt();
      int mat[] =new int[n];
      System.out.println("Enter the elements in the array");
      for(int i=0;i<n;i++)
      {
        mat[i]=sc.nextInt();
      }
      int maxi= mat[0];
      for(int i=1;i<n;i++)
      {
      if(mat[i]>maxi)
      maxi=mat[i];
      }
      System.out.println("Maximum value in the list is "+maxi);
   }
}
