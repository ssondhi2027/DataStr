package data_structure_assignment_two;
import java.util.Scanner;
public class ClassProblemOne 
{
    public static void main(String[] args)
    {
    Scanner scan = new Scanner(System.in);
int n = 4, k = 2;
// n is incremented to 5, then printed
System.out.println(++n );
// n is now 5, printed
System.out.println( n );
// n is printed as 5, then incremented to 6
System.out.println( n++ );
 // n is now 6, printed

System.out.println( n );
// n is 6, so -n is -6
System.out.println(-n);
System.out.println( n ); 
  // n is decremented to 5, then printed
System.out.println( --n );
// n is now 4, printed
System.out.println(n + k);  // n (4) + k (2) = 6, printed
        System.out.println(n);      // n is 4, printed
        System.out.println(k);      // k is 2, printed

        // Concatenation of n and k as a string
        System.out.println("" + n + " " + k);  // Prints "4 2" as a string

        // Printing a single character 'n' as a char (not a variable)
        System.out.println('n');    // This prints the character 'n', not the value of the variable n

        // Printing 'n * n =', careful with the comment as n * n is actually the arithmetic expression
        System.out.println(" n * n = ");  // Just prints the string
        System.out.println(n * n);        // Prints n * n, which is 4 * 4 = 16
}
    
}
