import java.util.Arrays;
import java.util.Scanner;
public class EleRepeating 
{
public static void main(String[] args) {
int n,rep_element;
boolean check=false;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the size ");
n=sc.nextInt();
int mat[]=new int[n];
rep_element=Integer.MIN_VALUE;
System.out.println("Enter the elements:");
for(int i=0;i<n;i++)
{	
         System.out.print("mat["+(i+1)+"]=:");
         mat[i]=sc.nextInt();
}
loop :for(int i=0;i<n;i++)
{   
  rep_element=mat[i];
    for(int j=i+1;j<n;j++)
    {
      if(mat[i]==mat[j])
      {
         check= true;
         break loop;
      }
      
    }
}

if(check)
{
	
   System.out.println("First repeating element is"+rep_element);
}
else
{
	
   System.out.println("No repeating element is found");
}

}

}