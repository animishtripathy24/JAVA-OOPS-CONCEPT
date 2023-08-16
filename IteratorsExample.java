import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class IteratorsExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the arraylist");
        int n=sc.nextInt();
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int x;
            x=sc.nextInt();
            arr.add(x);
        }
        Iterator it=arr.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
        sc.close();
    }
    

}
