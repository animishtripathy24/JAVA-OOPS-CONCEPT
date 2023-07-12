import java.io.*;

public class FileWrite {
    public static void main(String[] args)
    {
        try
        {
            FileWriter f=new FileWriter("C:\\Users\\hp\\OneDrive\\Desktop\\abc.txt");
            try{
                f.write("Java Programming File Handling!!!");
            }
            finally{
                f.close();
            }
            System.out.println("Successfully wrote into the file....");
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
    
}
