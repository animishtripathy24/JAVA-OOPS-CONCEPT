import java.util.Scanner;
class Fibbonacci
{
	
 static int a=0,b=1,c=0;   
 public static void main(String args[])
 {    
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of terms\n");
	int n = sc.nextInt();
	System.out.print(a+" "+b);
	displayFibbonacci(n-2);  
 } 
 
 public static void displayFibbonacci(int n)
 {    
    if(n>0)
	{    
         c = a + b;    
         a = b;    
         b = c;    
         System.out.print(" "+c);   
         displayFibbonacci(n-1);    
    }    
 }  
} 
		