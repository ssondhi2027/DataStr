package data_structure_assignment_two;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExerciseFour
{
    public static void main(String[] args) 
    {
        // create an empty linked list
        LinkedList<String> l_list = new LinkedList<String>();
        // use add() method to add values in the linked list
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("Pink");
        l_list.add("orange");

        // print original list
        System.out.println("Original linked list:" + l_list);
        //  Iterator is an object to loop through collections
        // .descendingIterator method is used to reverse the order of adding elements in linked list
        Iterator it = l_list.descendingIterator();
        // Print list elements in reverse order
        System.out.println("Elements in Reverse Order:");
        // while loop is used to run a loop until linked list have element in next line 
        while (it.hasNext()) 
        {
        System.out.println(it.next());
        }
    }

}
