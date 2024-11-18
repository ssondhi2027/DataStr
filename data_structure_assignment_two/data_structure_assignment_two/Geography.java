package  data_structure_assignment_two;
// Array List class is imported to store capital names
import java.util.ArrayList;
import java.util.Scanner;
public class Geography
{
            // name of arrat list is capitalsList of String data type
            public static ArrayList<String> capitalsList = new ArrayList<>();
            // method to add elements in array list
            private static void addCities() 
            {
                // .add() method is used to store element in array list
                capitalsList.add("Algiers");
                capitalsList.add("Belmopan");
                capitalsList.add("Ottawa");
                capitalsList.add("Moroni");
                capitalsList.add("London");
                capitalsList.add("Islamabad");
                capitalsList.add("Dakar");
                capitalsList.add("New Delhi");
                capitalsList.add("Abu Dhabi");
                capitalsList.add("Hanoi");
            }
                // usedCapitals array list is used to store Capital names that are entered by users
                private static final ArrayList<String> usedCapitals = new ArrayList<>();
                // GeoGame method with two parameters
                public static final void GeoGame( String player, String InetialCapital) 
                {
                    // if InetialCapital is null then it is player 1 turn as defined in main method
                    if (InetialCapital == null) 
                    {
                        System.out.println(player + " turn --> ");
                        // object of SCANNER class is created
                        Scanner sc = new Scanner(System.in);
                        String capital = sc.nextLine();
                        
                        // Check if the capital name is invalid
                        if (!capitalsList.contains(capital)) 
                        {
                            System.out.println("the entered capital is invalid ");
                            System.out.println(player+ " LOST");
                        }
                        // if capital name is already used 
                        else if (usedCapitals.contains(capital))
                        {
                            System.out.println("capital name already used ");
                        }
                        else 
                        {
                            usedCapitals.add(capital);
                            System.out.println(player + " chose " + capital);
                        //    Recursion of GeoGame method
                            GeoGame("Player 2", capital);
                        }
                        sc.close();
                    } 
         else 
        {
            // the capital must start with the last letter of the previous capital
            // find character ai last index of the string
            char lastLetter = InetialCapital.charAt(InetialCapital.length() - 1);
            System.out.println(" selected capital was " + InetialCapital );
            System.out.println(" Player must pick a capital starting with " + lastLetter );
            
            // array list of capitals names that starts with the last index value of previous capital 
            ArrayList<String> validCapitals = new ArrayList<>();
            for (String capital : capitalsList) 
            {
                // Check if it starts with the correct letter and hasn't been used yet
                if (!usedCapitals.contains(capital) && capital.toLowerCase().charAt(0) == Character.toLowerCase(lastLetter)) 
                {
                    validCapitals.add(capital);
                }
            }
            
            
            // Ask the current player to choose a capital from the valid options
            Scanner sc = new Scanner(System.in);
            System.out.println("Available capitals: " + validCapitals);
            System.out.println(player + " turn --> ");
            String capital = sc.nextLine();
            // if validCapitals array list does not contains the entered capital 
            if (!validCapitals.contains(capital)) 
            {
                System.out.println("the entered capital is invalid ");
                if (usedCapitals.contains(capital))
                {
                    System.out.println("capital name already used ");
                }
                System.out.println(player+" LOST");
              
            }
            else 
            {
                usedCapitals.add(capital);
                System.out.println(player + " chose " + capital);
                GeoGame("Player 1", capital);
            }
                  
        }
    }
    public static void main(String[] args) 
    {
        // add elements in capitalsList ArrayList
        addCities();
        System.out.println("List of Cities:");
        // for loop is used to display capitals names in capitalsList ArrayList
        for (String city : capitalsList) 
        {
            System.out.println(city);
        }

        // Start the game with player 1
        GeoGame("Player 1", null);
        System.out.println("List of choosen Cities:");
        // for loop is used to display names of valid capital entered by user
        for (String usedcity : usedCapitals) 
        {
            System.out.println(usedcity);
        }
        
    }
}
