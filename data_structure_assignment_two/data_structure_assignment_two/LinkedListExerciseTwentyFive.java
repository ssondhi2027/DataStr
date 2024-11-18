package data_structure_assignment_two;

import java.util.LinkedList;

public class LinkedListExerciseTwentyFive 
{
     public static void main(String[] args) 
     {
        LinkedList<String> c1= new LinkedList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Original linked list: " + c1);
        // isEmpty()method is used to check either linked list is empty or not 
        System.out.println("Check the above linked list is empty or not! "+c1.isEmpty());
        // .remove method is used to remove element at specific index
        c1.remove(0);
        System.out.println("remove element at 0th index --> " +c1);
        // .removeAll() method is used to remove all elements of linked list
        c1.removeAll(c1);
        System.out.println("Linked list after remove all elements "+c1);
        System.out.println("Check the above linked list is empty or not! "+c1.isEmpty());
    }

}
