package data_structure_assignment_two;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEmptyChecker 
{
    public static void main(String[] args)
    {
        Queue <String> queue_list = new LinkedList <>();
        Queue <Integer> emp_list = new LinkedList <>();
        queue_list.add("Yellow");
        queue_list.add("Green");
        queue_list.add("Pink");
        queue_list.add("Black");
        queue_list.add("Blue");
        queue_list.add("White");
        System.out.println("First Queue Elements : " + queue_list);
        // Check if the queue is empty
        // directly passing the method in print statement to find either the queue is empty or not 
        System.out.println("queue_list is empty --> " +queue_list.isEmpty());
        System.out.println("Second Queue Elements : " + emp_list);
        System.out.println("emp_list is empty --> " +emp_list.isEmpty());
        // creating object to find either queue is empty or not
        boolean isEmpty = queue_list.isEmpty();
        // if it is true that queue is empty
        if (isEmpty)
        {
            System.out.println("The First Queue is Empty");
        }
        // if it is false that queue is not empty 
        else
        {
            System.out.println("The First Queue is Not Empty");
        }
        System.out.println("Second Queue Elements : " + emp_list);
        isEmpty = emp_list.isEmpty();
        if (isEmpty)
        {
            System.out.println("The Second Queue is Empty");
        }
        else
        {
            System.out.println("The Second Queue is Not Empty");
        }
    }
    
}
