// This is a coding exercise using MadLibs.

import java.util.Scanner;

public class madlibs
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to...");
        System.out.println();
        System.out.println("MMM   MMM   AAA   DDDDD   LLL    IIIII  BBBBB     SSSSSS");
        System.out.println("MMMM MMMM  AA AA  DD  DD  LLL     III   BB  BBB  SS    SS");
        System.out.println("MM MMM MM  AA AA  DD  DD  LLL     III   BBBBB     SSS");
        System.out.println("MM  M  MM  AAAAA  DD  DD  LLL     III   BB  BBB     SSS");
        System.out.println("MM     MM  AA AA  DD DD   LLLLLL  III   BB  BB   SS   SSS");
        System.out.println("MM     MM  AA AA  DDDD    LLLLLL IIIII  BBBBB     SSSSSS");
        System.out.println();
        System.out.println("Let's play!  I am going to ask you a series of questions.");
        System.out.println("Type in the correct answer for each and then I'll share a story");
        System.out.println("that you helped create!");
        System.out.println();
        
        Scanner input = new Scanner(System.in);
        System.out.println("Tell me a color.");
        String variable1 = input.nextLine();
        System.out.println("Tell me a plural noun");
        String variable2 = input.nextLine();
        System.out.println("Tell me an adjective.");
        String variable3 = input.nextLine();
        System.out.println("Tell me an exclamation!");
        String variable4 = input.nextLine();
        System.out.println("Tell me a silly word.");
        String variable5 = input.nextLine();
        System.out.println("Tell me a verb in past tense.");
        String variable6 = input.nextLine();
        System.out.println("Tell me a plural noun.");
        String variable7 = input.nextLine();
        System.out.println("Tell me a verb.");
        String variable8 = input.nextLine();
        System.out.println("Tell me a plural noun.");
        String variable9 = input.nextLine();
        System.out.println("Tell me a verb.");
        String variable10 = input.nextLine();
        System.out.println("Tell me a plural noun.");
        String variable11 = input.nextLine();
        System.out.println();
        System.out.println("\033[H\033[2J");
        System.out.println("LITTLE RED RIDING HOOD");
        System.out.println("----------------------");
        System.out.println("One day, Little " + variable1 + " Riding Hood was going through the forest");
        System.out.println("carrying a basket of " + variable2 + " for her grandmother.  Suddenly,");
        System.out.println("she met a big " + variable3 + " wolf. '" + variable4 + "!' said the");
        System.out.println("wolf. 'Where are you going, little " + variable5 + "?' 'I'm going to my");
        System.out.println("grandmother's house,' she said.  Then the wolf " + variable6);
        System.out.println("away.  When Miss Riding Hood got to her grandmother's house, the wolf was");
        System.out.println("in bed dressed like her grandmother. 'My, Grandmother,' she said. 'What big");
        System.out.println(variable7 + " you have.' 'The better to " + variable8 + " you with,'");
        System.out.println("said the wolf. 'And, Grandmother,' she said, 'what big " + variable9);
        System.out.println("you have.' The wolf said, 'The better to " + variable10 + " you with.' And");
        System.out.println("then she said, 'What big " + variable11 + "you have, Grandmother.' But the");
        System.out.println("wolf said nothing.  He had just died of indigestion from eating Grandmother.");
        
        
    }
}
