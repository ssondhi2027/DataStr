package data_structure_assignment_two;

import java.util.LinkedList;
import java.util.Queue;

public class QueueReverseUsingRecursion
{
    public static void reverseQueue(Queue<Integer> queue)
    {
        if (queue.isEmpty())
        {
            return;
        }
        int frontElement = queue.poll();
        reverseQueue(queue);
        queue.offer(frontElement);
    }
        public static void main(String[] args)
        {
            Queue<Integer> queue = new LinkedList<>();
            queue.offer(10);
            queue.offer(20);
            queue.offer(30);
            queue.offer(40);
            queue.offer(50);
            System.out.println("Original Queue : " + queue);
            reverseQueue(queue);
            System.out.println("Reversed Queue : " + queue);
        }

}
