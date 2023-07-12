public class Primeno
{
    public static void main(String args[])
    {
      int i,j;
      int flag;
      for(i=3;i<100;i++)
      {
        flag=0;
        for(j=2;j<i;j++)
        {
            if(i%j==0)
            {
                flag++;
            }
        }
        if(flag==0)
        {
          System.out.printf("%d\t",i);
        }
      }  
    }
}