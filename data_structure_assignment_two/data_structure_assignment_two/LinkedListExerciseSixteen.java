package data_structure_assignment_two;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExerciseSixteen 
{
    public static void main(String[] args) 
    {
        // create an empty linked list
        LinkedList <String> l_list = new LinkedList <String> ();
        // use add() method to add values in the linked list
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("Pink");
        l_list.add("orange");
        // print the list
        System.out.println("Linked list before shuffling:\n" + l_list);
        // .shuffle() method is used to randomly shuffle the elements of linkedlist
        Collections.shuffle(l_list);
        System.out.println("Linked list after shuffling:\n" + l_list);
        Collections.sort(l_list);
        System.out.println("Linked list after sorting:\n" + l_list);

    }
    
}
