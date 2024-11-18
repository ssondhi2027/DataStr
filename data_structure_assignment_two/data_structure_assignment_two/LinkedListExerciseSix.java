package data_structure_assignment_two;

import java.util.LinkedList;

public class LinkedListExerciseSix 
{
     public static void main(String[] args) 
     {
        // create an empty linked list
        LinkedList<String> l_list = new LinkedList<String>();
        // use add() method to add values in the linked list
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        System.out.println("Original linked list:" + l_list);
        // Add an element at the beginning
        // .addFirest() method is used to add element at 0th index
        l_list.addFirst("White");
        // Add an element at the end of list
        // .addLast() method is used to add element at last index of linked list
        l_list.addLast("Pink");
        System.out.println("Final linked list:" + l_list);
    }
    
}
