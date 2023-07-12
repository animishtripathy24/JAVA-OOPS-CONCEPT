import java.util.Scanner;
public class Arrmaxmin
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter the size of the array\n");
        int n=sc.nextInt();
        int arr[]= new int[n];
        System.out.printf("enter the elements in the array\n");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int first_max = arr[0];
        int Second_max = arr[0];
        int first_min = arr[0];
        int Second_min = arr[0];
        //finding the first maximum;
        for(int i=0;i<n;i++)
        {
            if (arr[i]>first_max)
            {
                first_max=arr[i];
            }
        }
        //finding the second_maximum
        for(int i=0;i<n;i++)
        {
            if (arr[i]>Second_max && arr[i]!=first_max)
            {
                Second_max=arr[i];
            }
        }
        //finding the first minimum
        for(int i=0;i<n;i++)
        {
            if (arr[i]<first_min)
            {
                first_min=arr[i];
            }
        }
        //finding the second minimum
        for(int i=0;i<n;i++)
        {
            if (arr[i]<Second_min && arr[i]!=first_min)
            {
                Second_min=arr[i];
            }
        }

        //printing all
        System.out.printf("\nthe first maximum elements in the array is: %d",first_max);
        System.out.printf("\nthe Second maximum elements in the array is: %d",Second_max);
        System.out.printf("\nthe first minimum elements in the array is: %d",first_min);
        System.out.printf("\nthe Second minimum elements in the array is: %d",Second_min);


    }
}