package data_structure_assignment_two;

import java.util.LinkedList;
import java.util.Queue;

public class QueueForEachLoop 
{
    public static void main(String[] args)
    {
        Queue <String> queue_list = new LinkedList <>();
        queue_list.add("Orange");
        queue_list.add("Yellow");
        queue_list.add("Green");
        queue_list.add("Pink");
        queue_list.add("Black");
        queue_list.add("Blue");
        queue_list.add("White");
        queue_list.add("Red");
        System.out.print("Queue Elements : ");
        // Print queue elements using foreach loop
        // for each is a advanced form of for loop used to print elements of linkedlist or array list 
        for (String item: queue_list)
        {
        System.out.print(item + " ");
        }
    }
}
