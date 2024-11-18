package data_structure_assignment_two;

public class ClassProblemSeven 
{
    public static void main(String[] args) 
    {
        char [] title = {'T', 'i', 't', 'a', 'n', 'i', 'c'};
        // Error: 'ch' is not declared
        // ch = title[1];
        char ch = title[1];
        title[3] = ch;
        System.out.println( title );
        System.out.println( ch );
        
    }
    
}
