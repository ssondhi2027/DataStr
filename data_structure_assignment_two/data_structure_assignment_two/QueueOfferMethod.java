package data_structure_assignment_two;

import java.util.LinkedList;
import java.util.Queue;

public class QueueOfferMethod 
{
    public static void main(String[] args)
{
Queue <String> queue_list = new LinkedList <>();
// Add elements to the queue using add()
queue_list.add("Orange");
queue_list.add("Yellow");
queue_list.add("Green");
System.out.println("Add element to queue using .add() method -->" +queue_list);
// Add elements to the queue using offer()
queue_list.offer("Pink");
queue_list.offer("Black");
queue_list.offer("Blue");
queue_list.offer("White");
queue_list.offer("Red");
System.out.println("adding elements to queue_list using .offer() method -->" +queue_list);
}

}
