class Parent
{
    void display()
    {
        System.out.println("Parent class");
    }

}
class Child extends Parent
{
    public Child()
    {
        System.out.println("child class constructor");
    }
    void display()
    {
        System.out.println("child class");
        super.display();
    }

}
public class Demo {
    public static void main(String args[])
    {
       
        Child ob = new Child();
        ob.display();
    }
    
}
