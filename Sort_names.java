import java.util.Scanner;
public class Sort_names
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of list ");
        int n=sc.nextInt();
        int minIndex;
        String name[]=new String[n];
        System.out.println("Enter names:");
        for(int i=0;i<n;i++)
        name[i]=sc.next();

        for( int i=0;i<n-1;i++)
        { 
            minIndex=i;
           for(int j=i+1;j<n;j++)
           {
            int ans =name[j].compareTo(name[minIndex]);
            if(ans<0)
            {
                minIndex=j;
            }
            else
            {
                continue;
            }
          }
          String temp=name[minIndex];
                name[minIndex]=name[i];
                name[i]=temp;  
        }
        System.out.println("The name in ascending order format is");
        
        for( int i=0;i<n;i++)
        {

          System.out.println(name[i]);
        }
    
  }
}
