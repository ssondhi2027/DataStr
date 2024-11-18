package data_structure_assignment_two;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class QueueArrayDequeue 
{
    public static void main(String[] args)
    {
        Queue <String> queue_list = new ArrayDeque <>();
        queue_list.add("Yellow");
        queue_list.add("Green");
        queue_list.add("Pink");
        queue_list.add("Black");
        queue_list.add("Blue");
        queue_list.add("White");
        queue_list.add("Red");
        Iterator itr = queue_list.iterator();
        System.out.print("Queue Elements : ");
        // while loop is used to print the queue 
        while (itr.hasNext())
        {
        System.out.print(itr.next() + " , ");
        }
        
    }
}
