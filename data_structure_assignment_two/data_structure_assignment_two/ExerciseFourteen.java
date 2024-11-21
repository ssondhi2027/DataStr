package data_structure_assignment_two;

import java.util.ArrayList;
import java.util.Collections;
// the .swap() method is used to swap elements of two idex
public class ExerciseFourteen 
{
    public static void main(String[] args) 
    {
        // here name of array list is c1
        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Array list before Swap:");
        // for loop is used to print the list 
        for(String a: c1)
        {
        System.out.println(a);
        }
        // array can also be printed like this 
        System.out.println("c1 : " +c1);
        //Swapping 1st(index 0) element with the 3rd(index 2) element
        // collections is a abstract class thet have methods related to array list
        // .swap method is used to swap the index value from inetial to final
        Collections.swap(c1, 0, 2);
        System.out.println("Array list after swap:");
        for(String b: c1)
        {
        System.out.println(b);
        }
        System.out.println(c1);
    }
}
