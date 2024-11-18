package data_structure_assignment_two;

public class ClassProblemSix 
{
    public static void main(String[] args) 
    {
        int found = 0, count = 5; // Initializing variables
        // error if 
        // if (!found || --count == 0) 
        if ((found == 0) || --count == 0) 
        {
            System.out.println("danger"); // Printing if condition is true
            System.out.println("count = " + count); // Printing the value of count
        }
    }
    
}
