package data_structure_assignment_two;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReverseUsingStack 
{
    public static void main(String[] args)
    {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        // adding elements in queue 
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);
        queue.offer(60);
        queue.offer(70);
        queue.offer(80);
        queue.offer(90);
        queue.offer(100);
        System.out.println("Queue Before Reversal : " + queue);
        // Reverse the queue using a stack
        // while the queue is not empty it would remove element from queue using .poll()method and add it in stack using .push() method 
        while(!queue.isEmpty())
        {
            stack.push(queue.poll());
        }
        // while stack is not empty the while loop will add element to queue using .offer() method and remove it from stack using .pop() method 
        while(!stack.isEmpty())
        {
            queue.offer(stack.pop());
        }
        System.out.println("Queue After Reversal : " + queue);
    }

    
}
