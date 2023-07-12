public class Capitalargs
{
	public static void main(String args[])
	{
        System.out.print(Character.toUpperCase(args[0].charAt(0)));
		for(int i=1;i<args[0].length();i++)
		{
			System.out.print(Character.toLowerCase(args[0].charAt(i)));
		}
		System.out.print(" ");
		System.out.print(Character.toUpperCase(args[1].charAt(0)));
		for(int i=1;i<args[1].length();i++)
		{
			System.out.print(Character.toLowerCase(args[1].charAt(i)));
		}

}
}