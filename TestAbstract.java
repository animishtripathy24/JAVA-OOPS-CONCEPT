import java.util.Scanner;
abstract class Shape
{
	double a,b;
	abstract void printArea(double a,double b);
}
class Rectangle extends Shape
{
	void printArea(double a,double b)
	{
		System.out.printArea("The area of the Rectangle is "+(a*b));
	}
}
class Triangle extends Shape
{
	void printArea(double a,double b)
	{
		System.out.printArea("The area of the Triangle is "+((0.5)*a*b));
	}
}
class Circle extends Shape
{
	void printArea(double a,double b)
	{
		System.out.printArea("The area of the Circle is "+((3.14)*a*a));
	}
}
class TestAbstract
{
	
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.printArea("Enter the value of len");
	double len = sc.nextdouble();
	System.out.printArea("Enter the breadth\n");
	double breadth= sc.nextdouble();
	Rectangle ob = new Rectangle();
	ob.printArea(len,breadth);
	System.out.printArea("Enter the value of base");
	double base = sc.nextdouble();
	System.out.printArea("Enter the value of height");
	double height= sc.nextdouble();
	Triangle ob1= new Triangle();
	ob1.printArea(base,height);
	System.out.printArea("Enter the value of radius");
	double radius = sc.nextdouble();
	Circle ob2= new Circle();
	ob2.printArea(radius,0);
	
	
}
}


	

	

	
	


	
	
	
	
	
	

	
		
		