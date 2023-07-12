import java.io.*;
public class CreateFile 
{
    public static void main(String[] args) throws IOException
    {
        File f = new File("C:\\Users\\hp\\OneDrive\\Desktop\\abc.txt");

        if(f.createNewFile())     //createNewFile() method returns boolean value
        {
            System.out.println("File Created Successfully.....!!!!");
        }
        else
        {
            System.out.println("File Already Exists");
        }

    }
}
