import java.util.*;
class Calculation(String c1,String c2,String c3)
{
	String c1,c2,c3;
	Calculation()
	{
			this.c1=c1;
			this.c2=c2;
			this.c3=c3;
	}
	int Total_cost=0;
	Calculation obj= new Calculation();
	if(c1.equals("veg") && c2.equals("small") && c3.equals("no"))
	{
		Total_cost+=200;
	}
	elseif(c1.equals("veg") && c2.equals("small") && c3.equals("yes"))
	{
		Total_cost+=230;
	}
	else if(c1.equals("veg") && c2.equals("medium") && c3.equals("no"))
	{
		Total_cost+=350;
	}
	else if(c1.equals("veg") && c2.equals("medium") && c3.equals("yes"))
	{
		Total_cost+=370;
	}
	else if(c1.equals("nonveg") && c2.equals("small") && c3.equals("no"))
	{
		Total_cost+=270;
	}
	else if(c1.equals("nonveg") && c2.equals("small") && c3.equals("yes"))
	{
		Total_cost+=300;
	}
	elseif(c1.equals("nonveg") && c2.equals("medium") && c3.equals("no"))
	{
		Total_cost+=420;
	}
	else
	{
		Total_cost=450;
	}
	System.out.println("The Total cost is "+Total_cost);
}


	
	
	
public class Delivery
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Delivery Italian_pizza = new Delivery();
		System.out.println("Enter the choice VEG or NON-VEG");
		String c1=sc.next();
		System.out.println("Enter the choice SMALL or MEDIUM");
		String c1=sc.next();
		System.out.println("YOU WANT TO ADD TOPPINGS:) Enter YES or NO");
		String c1=sc.next();
		Italian_pizza.calculation(c1,c2,c3);
	}
}