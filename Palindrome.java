import java.util.Scanner;
public class Palindrome
{
    public static void main(String args[])
    {
        String revstr= "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string ");
        String str = sc.nextLine();
        int n = str.length();
        for(int i=n-1;i>=0;i--)
        {
            revstr=revstr+str.charAt(i);
        }
        if(str.equalsIgnoreCase(revstr))
        {
            System.out.println("The string is palindrome.");
        }
        else
        {
            System.out.println("The string is not palindrome.");
        }
    }
}