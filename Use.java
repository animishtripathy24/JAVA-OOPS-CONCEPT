class Line
{
	int length;
	public Line(int len)
	{
		length=len;
	}
	public void length()
	{
		System.out.println("Length of line="+length);
	}
}
class Rectangle extends Line
{
	int breadth,area;
	public Rectangle(int len,int br)
	{
		super(len);
		breadth=br;
	}
	public void area()
	{
		super.length();
		area=length*breadth;
		System.out.println("Area of Rectangle="+area);
	}
}
class Cuboid extends Rectangle
{
	
	int height,volume;
	public Cuboid(int len,int br,int ht)
	{
		super(len,br);
		height=ht;
	}
	public void volume()
	{
		super.area();
		volume=area*height;
		System.out.println("Volume of cuboid="+volume);
	}
}
public class Use
{
	public static void main(String args[])
	{
		Cuboid ob=new Cuboid(6,5,4);
		ob.volume();
	}
}
			
	