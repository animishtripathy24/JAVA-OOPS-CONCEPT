import java.io.*;
import java.util.*;
class Customer
{
    private int custNo;
    private String custName;
    private String custAddr;

    //setters
    public void setcustNo(int custNo)
    {
        this.custNo=custNo;
    }
    public void setcustName(String custName)
    {
        this.custName=custName;
    }
    public void setcustAddr(String custAddr)
    {
        this.custAddr=custAddr;
    }

    //getters
    public int getcustNo()
    {
        return this.custNo;
    }
    public String getcustName()
    {
        return this.custName;
    }
    public String getcustAddr()
    {
        return this.custAddr;
    }
}


class CustomerReports
{
    public void storeReport(Customer obj)
    {
        //writing into the file....
        try
        {
            FileWriter f=new FileWriter("C:\\Users\\hp\\OneDrive\\Desktop\\CustomerRecords.txt");
            try{
                f.write("\nCustomer No."+"\t"+"Customer Name"+"\t"+"Customer Address"+"\n"+obj.getcustNo()+"\t\t"+obj.getcustName()+"\t\t"+obj.getcustAddr());
            }
            finally{
                f.close();
            }
            System.out.println("Successfully wrote into the file....");
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    public void ReadInto()
    {
        try{
            FileReader fr=new FileReader("C:\\Users\\hp\\OneDrive\\Desktop\\CustomerRecords.txt");    
            int i;    
            while((i=fr.read())!=-1)    
            System.out.print((char)i); 
            fr.close();   
        }
        catch(IOException e)
        {
            e.printStackTrace;
        }
    }
    public void appendInfo(Customer obj)
    {
        try
        {
            String filename= "C:\\Users\\hp\\OneDrive\\Desktop\\CustomerRecords.txt";
            FileWriter fw = new FileWriter(filename,true); //the true will append the new data
            fw.write("\n"+obj.getcustNo()+"\t\t"+obj.getcustName()+"\t\t"+obj.getcustAddr());//appends the string to the file
            fw.close();
        }   
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
public class Reception {

    public static void main(String[] args) throws IOException
    {
        //creating a new File CustomerRecords.txt
        File f = new File("C:\\Users\\hp\\OneDrive\\Desktop\\CustomerRecords.txt");

        if(f.createNewFile())     //createNewFile() method returns boolean value
        {
            System.out.println("File Created Successfully.....!!!!");
        }
        else
        {
            System.out.println("File Already Exists");
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Customer Number");
        int custNo=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Customer Name");
        String custName=sc.nextLine();
        System.out.println("Enter the Customer Address");
        String custAddr=sc.nextLine();
        Customer obj2=new Customer();
        obj2.setcustNo(custNo);
        obj2.setcustName(custName);
        obj2.setcustAddr(custAddr);
        CustomerReports obj1=new CustomerReports();
        obj1.storeReport(obj2);
        obj1.ReadInto();
        System.out.println("\nWant to enter more values press-true or false");
        boolean want=sc.nextBoolean();
        while(want)
        {
            System.out.println("Enter the Customer Number");
            int custNo1=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the Customer Name");
            String custName1=sc.nextLine();
            System.out.println("Enter the Customer Address");
            String custAddr1=sc.nextLine();
            Customer obj3=new Customer();
            CustomerReports obj4=new CustomerReports();
            obj3.setcustNo(custNo1);
            obj3.setcustName(custName1);
            obj3.setcustAddr(custAddr1);
            obj4.appendInfo(obj3);
            obj4.ReadInto();
            System.out.println("\nWant to enter more values press-true or false");
            want=sc.nextBoolean();
        }
    }

}