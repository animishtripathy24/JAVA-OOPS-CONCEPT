import java.util.Scanner;
class ParametCons
{
	int id;
	String name;
	public ParametCons(int id,String name)
	{
		this.id = id;
		this.name = name;
		
	}
	public void print()
	{
		System.out.println("The name is "+name+"the id is "+id);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name_1\n");
		String name_1=sc.next();
		System.out.println("Enter the id_1\n");
		int id_1=sc.nextInt();
		ParametCons obj1=new ParametCons(id_1,name_1);
		obj1.print();
		//System.out.println("\n");
		//System.out.println("Enter the name_2\n");
		//name_1=sc.next();
		//System.out.println("Enter the id_2\n");
		//id_1=sc.nextInt();
		System.out.println('\n');
		ParametCons obj2=new ParametCons(obj1);
		obj2.print();
		
	}
}

		
		
	
		