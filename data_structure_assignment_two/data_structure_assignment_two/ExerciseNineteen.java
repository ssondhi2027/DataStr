package data_structure_assignment_two;

import java.util.ArrayList;

public class ExerciseNineteen 
{
     public static void main(String[] args) 
    {
        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Original array list: " + c1);
        System.out.println("Let trim to size the above array: ");
        // .trimToSize is a method used to change the size of array to number of items it holds
        c1.trimToSize();
        System.out.println(c1);
        try 
        {
            c1.add("aaa");
        } catch (Exception e) 
        {
            System.out.println("cannot add more elements");
        }
    }

    
}
