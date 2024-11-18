package data_structure_assignment_two;

import java.util.LinkedList;
import java.util.Queue;

public class QueueRemoveItem 
{
    public static void main(String[] args)
    {
        // linked list to create a queue 
        Queue < String > queue_list = new LinkedList < > ();
        queue_list.add("Yellow");
        queue_list.add("Green");
        queue_list.add("Pink");
        queue_list.add("Black");
        queue_list.add("Blue");
        queue_list.add("White");
        queue_list.add("Red");
        System.out.println("Queue before Removal : " + queue_list);
        // the purpose of both .remove() and .poll() methods are same
        System.out.println("remove item using .remove()  method --> " +queue_list.remove() );
        System.out.println("Removed Item using .poll() method : " +queue_list.poll());
        System.out.println("Queue after Removal : " + queue_list);
    }
    
}
