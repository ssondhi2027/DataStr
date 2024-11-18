package data_structure_assignment_two;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePeekMethod 
{
    public static void main(String[] args)
    {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Blue");
        queue.offer("White");
        queue.offer("Black");
        queue.offer("Orange");
        queue.offer("Pink");
        queue.offer("Yellow");
        System.out.println("Queue Elements : "+queue);
        // Access the element at the head of the queue using peek()
        // .peek() method is used to access the head element of the queue 
        String headElement = queue.peek();
        // if the queue is not empty then print the head element of the queue 
        if (headElement != null)
        {
            System.out.println("Element at the head of the Queue :" + headElement);
        }
        else
        {
            System.out.println("The queue is Empty");
        }

        System.out.println("Head element of the queue --> " +queue.peek());
    }

    
}
