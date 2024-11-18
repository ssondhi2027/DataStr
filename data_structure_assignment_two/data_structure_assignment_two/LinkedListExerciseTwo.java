package data_structure_assignment_two;

import java.util.LinkedList;

public class LinkedListExerciseTwo 
{
     public static void main(String[] args) 
    {
        // create an empty linked list
        LinkedList<String> l_list = new LinkedList<String>();
        // use add() method to add values in the linked list
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("White");
        l_list.add("Pink");
        // Print the linked list using for loop
        for (String element : l_list) 
        {
            System.out.println(element);
        }
    }
}
