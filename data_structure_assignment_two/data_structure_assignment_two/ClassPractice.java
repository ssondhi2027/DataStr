package data_structure_assignment_two;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClassPractice 
{
    // this is a program to find the min and max value in unsorted list 
    // function to find minimum value in an unsorted
// list in Java using Collection
public static Integer findMin(List<Integer> list)
{
    // check list is empty or not
    if (list == null || list.size() == 0) 
    {
        return Integer.MAX_VALUE;
    }
    // return minimum value of the ArrayList
    return Collections.min(list);
}
// function return maximum value in an unsorted
// list in Java using Collection
public static Integer findMax(List<Integer> list)
{
    // check list is empty or not
    if (list == null || list.size() == 0) 
    {
        return Integer.MIN_VALUE;
    }
    // return maximum value of the ArrayList
    return Collections.max(list);
}
public static void main(String[] args)
{
    // create an ArrayList Object list
    List<Integer> list = new ArrayList<>();
    // add element in ArrayList object list
    list.add(22);
    list.add(11);
    list.add(33);
    list.add(44);
    // print min and max value of ArrayList
    System.out.println("Min: " + findMin(list));
    System.out.println("Max: " + findMax(list));
}
}
