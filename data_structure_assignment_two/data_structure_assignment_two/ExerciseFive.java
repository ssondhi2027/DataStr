package data_structure_assignment_two;
// the .set() methos is used to reterieve the element at specific index and change it 
import java.util.ArrayList;
import java.util.List;

public class ExerciseFive 
{
     public static void main(String[] args) 
     {
        // Creae a list and add some colors to the list
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        // Print the list
        System.out.println(list_Strings);
        // Update the third element with "Yellow"
        // .set method is used to change the value at specific index
        list_Strings.set(2, "Yellow");
        // Print the list again
        System.out.println(list_Strings);
    }
    
}
