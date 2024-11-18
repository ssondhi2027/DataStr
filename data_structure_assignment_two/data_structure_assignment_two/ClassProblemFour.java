package data_structure_assignment_two;

public class ClassProblemFour 
{
    // enum is a special type that defines a collection of constants, often used to represent a fixed set of related values. Enums are useful when you need to work with a predefined list of values that don't change, such as days of the week, months of the year, or states in a workflow.
    enum colorType {red, orange, yellow, green, blue, violet};
        public static void main(String[] args)
        {
            colorType shirt, pants;
            shirt = colorType.red;
            pants = colorType.blue;
            System.out.println("Shirt color : " + shirt + " , Pant color : " + pants );
            // output
            // Shirt color : red , Pant color : blue
        }
    
}
