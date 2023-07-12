class Parent{
    public Parent()
    {
        System.out.println("Parent Constructor");

    }
    int a=10;
    void display(){
        System.out.println("Parent Class");
    }    
}
class Child extends Parent{
    public Child()
    {
        System.out.println("Child Constructor");
    }

        int a=20;
        void display()
        {
            System.out.println("Child class");
            System.out.println(a);
            System.out.println(super.a);
            super.display();
        }
}

public class Super {
    public static void main(String args[])
    {
        Child obj=new Child();
        obj.display();
    }
    
}
