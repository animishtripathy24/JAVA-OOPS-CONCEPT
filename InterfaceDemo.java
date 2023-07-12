interface A{
    void ADisplay();
}
interface B{
    void BDisplay();
}

class AB implements A,B{
    public void ADisplay()
    {
        System.out.println("Adisplay");
    }
    public void BDisplay()
    {
        System.out.println("BDisplay");
    }
}

public class InterfaceDemo {
    public static void main(String args[])
    {
        AB obj = new AB();
        obj.ADisplay();
        obj.BDisplay();
    }
}
