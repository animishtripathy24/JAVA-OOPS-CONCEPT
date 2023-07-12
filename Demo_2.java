import java.awt.*;  
import java.awt.event.*;  
public class Demo_2 extends Frame implements MouseListener
{  
    TextField tf;  
    Demo_2()
	{  
    	
        addMouseListener(this);    
        tf=new TextField();  
        tf.setBounds(60,50,170,20);  
        add(tf);  
        setSize(300,300);  
        setLayout(null);  
        setVisible(true);  
    }  
    public void mouseClicked(MouseEvent e) 
	{  
        tf.setText("Mouse Clicked");  
    }  
    public void mouseEntered(MouseEvent e) 
	{  
        tf.setText("Mouse Entered");  
    }  
    public void mouseExited(MouseEvent e) 
	{  
        tf.setText("Mouse Exited");  
    }  
    public void mousePressed(MouseEvent e) 
	{  
        tf.setText("Mouse Pressed");  
    }  
    public void mouseReleased(MouseEvent e) 
	{  
        tf.setText("Mouse Released");  
    }  
    public static void main(String[] args) 
	{  
       new Demo_2();
    }
}