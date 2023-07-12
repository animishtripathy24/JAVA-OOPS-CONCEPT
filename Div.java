import javax.swing.*;  
public class Div
{
	JFrame f;  
    Div()
	{  
        f=new JFrame();
       	String first_num=JOptionPane.showInputDialog("Enter the first num:");
		String second_num=JOptionPane.showInputDialog("Enter the Second num:");
		try
		{
			int n1=Integer.parseInt(first_num);
		    int n2=Integer.parseInt(second_num);
		    int div = n1/n2;
		}
		catch(NumberFormatException e)
		{
			 JOptionPane.showMessageDialog(f,"Please Enter Integers only");
		}
		catch(ArithmeticException e)
		{
			JOptionPane.showMessageDialog(f,"Division By Zero Not Possible");
		}
    }		
	
	public static void main(String args[])
	{
       new Div();  
	}
}


