package data_structure_assignment_two;

import java.util.LinkedList;
import java.util.Queue;

public class CreateQueue 
{
    public static void main(String[] args)
    {
        // creating queue using linked list
        Queue <String> queue = new LinkedList <> ();
        queue.add("Yellow");
        queue.add("Green");
        queue.add("Pink");
        queue.add("Black");
        queue.add("Blue");
        queue.add("White");
        queue.add("Red");
        System.out.println("Queue Elements : " + queue);
    }

    
}
