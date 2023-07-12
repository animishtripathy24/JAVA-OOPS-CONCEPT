class Parent{
    void display(){
        System.out.println("Parent Class");
    }    
}

class Child extends Parent{

        void display()
        {
            System.out.println("Child class");
        }
}

public class MethodOverriding {
    public static void main(String args[])
    {
        Child obj = new Child();
        obj.display();
    }

    
}
