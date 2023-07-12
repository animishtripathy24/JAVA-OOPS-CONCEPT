import java.io.*;

public class FileInfo {

    public static void main(String[] args) throws IOException
    {
        File f = new File("C:\\Users\\hp\\OneDrive\\Desktop\\abc.txt");

        if(f.exists())
        {
            System.out.println("File Name is "+f.getName());
            System.out.println("File Path is "+f.getAbsolutePath());
            System.out.println("File Size "+f.length());
            System.out.println("File Readable "+f.canRead());
            System.out.println("File writable :"+f.canWrite());
            f.delete();
        }
        else
        {
            System.out.println("File does not exist");
        }
    }

    
}
