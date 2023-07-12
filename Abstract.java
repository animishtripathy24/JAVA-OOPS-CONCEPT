abstract class A
{
    abstract void display();
}
abstract  class B extends A
{
    public void display()
    {
        System.out.println("ClassA");
    }
    abstract void show(); 
}
class C extends B
{
    public void show()
    {
        super.display();
        System.out.println("ClassB");
    }
}

public class Abstract {
    public static void main(String args[])
    {
        C obj = new C();
        obj.show();
    }
    
}
