import java.util.*;

public class CollectionInterfaceExamples {
    static void ArrayListExamples()
    {
        //creating a new ArrayList
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of arraylist");
        int n =sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        System.out.println("Enter the elements into the array list");
        for(int i=0;i<n;i++)
        {
            int number;
            number=sc.nextInt();
            arr.add(number);
        }
        //size() finction gives the size of the arraylist
        System.out.println("Size: "+arr.size());
        //displaying the arraylist
        for(int i=0;i<arr.size();i++)
        {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        //to see whether the particular value is present in the list or not
        //we use contains() function and pass it with an object as parameter to check 
        //if that element exists 
        //inside our collection
        System.out.println("contains 10 ->"+arr.contains(10));

        //if we have to modify a particular value we use set() function
        arr.set(2,10);
        System.out.println("After modifying the list looks like this ->");
        for(var x:arr)
        {
            System.out.print(x+" ");
        }

        sc.close();
    }
    static void StackExamples()
    {
        Stack<String>s=new Stack<>();
        s.push("Animish");
        s.push("Abhinay");
        s.push("Anamay");
        s.push("Binay");
        s.push("Agastya");
        System.out.println("The size of the stack is :-> "+s.size());
        System.out.println("\n"+"The top element of the stack is : "+s.peek());
        System.out.println("Khalli hai..kya bhaii-> "+s.empty());
        //search(<value>) returns the 1-based positioning 
        System.out.println("10 present or not-> "+s.search(10));//returns -1 
        //printing the elments of the stack
        while(!s.empty())
        {
            System.out.print(s.peek()+" ");
            s.pop();
        }
        
    }
    static void QueueExamples()
    {
        LinkedList<Integer>q=new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q);
        System.out.println("The top element of the queue is: "+q.poll());
        System.out.println("Khalli hai kya bhaiii-> "+q.isEmpty());
        System.out.println("The size of the queue is -> "+q.size());
    }
    static void DequeExamples()
    {
        Deque<Integer> dq=new ArrayDeque<>();
        dq.addFirst(1);
        dq.addLast(2);
        dq.addFirst(0);
        dq.addLast(3);
        System.out.println(dq);
        System.out.println(dq.pollFirst());
        System.out.println(dq.removeLast());
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
        System.out.println(dq);

    }
    static void SetExamples()
    {
        SortedSet<Integer>s=new TreeSet<>();
        s.add(12);
        s.add(2);
        s.add(35);
        s.add(1);
        s.add(50);
        System.out.println(s);
        s.remove(2);
        s.add(1);
        System.out.println(s.contains(3));
        System.out.println(s);
    }
    static void MapExamples()
    {
        Map<Integer,String>mp=new HashMap<>();
        mp.put(1,"Animish");
        mp.put(2,"Tripathy");
        mp.put(3,"Abhinay");
        mp.put(4,"Anamay");
        //iterarting over a map
        for(var x:mp.entrySet())
        {
            System.out.println(x.getKey()+" -> "+x.getValue());
        }
    }
    public static void main(String[] args) 
    {
        //ArrayListExamples();
        //StackExamples();
        //QueueExamples();
        //DequeExamples();
        //SetExamples();
        MapExamples();
    }
}
