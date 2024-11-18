package data_structure_assignment_two;

public class ClassProblemThree 
{
    public static void main(String[] args)
    {
        int n;
        // inetialise n as 4
        System.out.println( (n = 4) );
        // == are used for boolean values 
        System.out.println( (n == 4) );
        // > is used for boolean values 
        System.out.println( (n > 3) );
         // < is used for boolean values 
        System.out.println( (n < 4) );
        //  inetialise n as 0
        System.out.println( (n = 0) );
        System.out.println( (n == 0) );
        System.out.println( (n > 0) );
        // 
        System.out.println( (n == 0 && true) );
        System.out.println( (n == 0 || true) );
        System.out.println( (!(n == 2) ));
            // output
            // 4
            // true
            // true
            // false
            // 0
            // true
            // false
            // true
            // true
            // true
    }
    
}
