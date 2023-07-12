import java.util.Scanner;
public class Greatest1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c)
        {
            System.out.printf("the greatest among three numbers is %d",a);

        }
        else if(b>c)
        {
            System.out.printf("the greatest among three numbers is %d",b);
        }
        else{
            System.out.printf("the greatest among three numbers is %d",c);
        }  
    }
}