// Create a game where the computer attempts to guess the player's number.
// The computer only gets 20 guesses.
// The user gets to decide between 1-10, 1-100, 1-1000
// 1-10000, or 1-100000.

import java.util.Scanner;

public class guessMyNumber
{
    public static void main(String[] args)
    {
        System.out.println("Hello! Let's play a game!");
        System.out.println("How difficult would you like it to be?");
        System.out.println("Enter a number between 1(easy) and 5(hard)");
        Scanner input = new Scanner(System.in);
        int difficulty = input.nextInt();
        while(true){
            if(difficulty < 1 || difficulty > 5){
                System.out.println("invalid number.");
                System.out.println("Enter a number between 1 and 5");
                difficulty = input.nextInt();
            }
            else{
                break;
            }
        }
        input.nextLine();
        int max_num = (int)Math.pow(10, difficulty);
        int min_num = 0;
        System.out.println("Think of a number between 1-" + max_num + ".");
        System.out.println("I'm going to ask you yes or no questions and will figure");
        System.out.println("out your number in 20 guesses or less.");
        System.out.println("Let's get started!");
        
        int guess = max_num / 2;
        String response = "";
        for(int i = 0; i < 20; i++){
            System.out.println("Guess#" + (i+1) + ": Is your number greater than or equal to " + guess + "?");
            response = input.nextLine();
            if(response.equals("yes"))
            {
                min_num = guess;
                guess = (max_num + guess) / 2;
                
            }
            else
            {
                max_num = guess;
                guess = (min_num + guess) / 2;
                
            }
            if(max_num == guess || min_num == guess){
                break;
            }
            
        }
        System.out.println("Your number is " + guess + ".");
        System.out.println("I've done it again!");
        
    }
}
