package data_structure_assignment_two;

import java.util.LinkedList;
import java.util.Queue;

public class QueueRetrieveAndRemoveElement 
{
    public static void main(String[] args)
    {
        Queue <String> queue = new LinkedList <>();
        queue.add("Pink");
        queue.add("Blue");
        queue.add("Yellow");
        queue.add("Green");
        queue.add("Black");
        queue.add("White");
        queue.add("Pink");
        queue.add("Orange");
        queue.add("Red");
        System.out.println("Queue Elements : "+queue);
        // .poll() method is used to remove element form head of queue
        System.out.println("Removed Element : " + queue.poll());
        System.out.println("Queue Elements : "+queue);
    }

}
