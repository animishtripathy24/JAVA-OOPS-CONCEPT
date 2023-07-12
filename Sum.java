public class Sum
{
    public static void main(String args[]) 
    { 
          int sum=0;
          int size =args.length;
          for(int i=0;i<size;i++)
           {
                int n=Integer.parseInt(args[i]);
                sum=sum+n;
           }
      System.out.printf("sum of the given numbers is numbers is %d",sum);
    }
}
