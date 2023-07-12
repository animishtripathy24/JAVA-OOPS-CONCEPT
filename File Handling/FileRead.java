import java.io.*;

public class FileRead {
    public static void main(String[] args)
    {
        try{
            FileReader fr=new FileReader("C:\\Users\\hp\\OneDrive\\Desktop\\abc.txt");    
            int i;    
            while((i=fr.read())!=-1)    
            System.out.print((char)i); 
            fr.close();   
        }
        catch(IOException e)
        {
            System.out.println(e);
        }

    }
}
