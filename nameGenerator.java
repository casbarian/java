import java.util.Scanner;

public class nameGenerator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello!  Welcome to the Fantasy Name Converter!");
        System.out.println();
        System.out.println("What is your first name?");
        String firstName = input.nextLine();
        System.out.println("What is your last name?");
        String lastName = input.nextLine();
        
        NameCalc user1 = new NameCalc(firstName, lastName);
        
        System.out.println("What type of name would you like to do?");
        System.out.println("Type: \"starwars\" or \"fantasy\"");
        String choice = input.nextLine();
        
        if(choice.equals("starwars"))
        {
            System.out.println("You've chosen Star Wars!");
            System.out.println("A few more questions...");
            System.out.println("What is your mother's maiden name?");
            String maidenName = input.nextLine();
            System.out.println("What city were you born in?");
            String city = input.nextLine();
            System.out.println();
            System.out.println("Your Star Wars name is: " + user1.starWarsName(maidenName, city));
            
        }
        else if(choice.equals("fantasy"))
        {
            System.out.println("You've chosen Fantasy!");
            System.out.println("A few more questions...");
            System.out.println("Give me a one word noun.");
            String noun1 = input.nextLine();
            System.out.println("Give me another noun.");
            String noun2 = input.nextLine();
            System.out.println();
            System.out.println("Your fantasy name is: " + user1.fantasyName(noun1, noun2));
        }
        else
        {
            System.out.println("That is not a valid choice. Goodbye.");
        }
        // Conditional your way through. Use methods.
    }
}
