import java.util.Scanner;

public class StringReverse {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String str =sc.nextLine();
        String str1="";
        int start =str.length()-1;
        while(start >=0)
        {
            int end = start;
            while(start>=0 && str.charAt(start)!=' ')
            {
                start--;
            }
            
            if(str1.isEmpty())
            {
                str1=str1.concat(str.substring(start+1,end+1));
            }
            else
            {
                str1=str1.concat(" "+str.substring(start+1,end+1));
            }
        }
        System.out.println("The Required String is:"+str1);
    }
    
}
