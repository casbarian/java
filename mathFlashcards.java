import java.util.Scanner;
import java.lang.Math;

public class MyProgram
{
    public static void main(String[] args)
    {
        // Banner for Game
        System.out.println("*************************");
        System.out.println("*                       *");
        System.out.println("* ARITHMETIC FLASHCARDS *");
        System.out.println("*                       *");
        System.out.println("*************************");
        System.out.println();
        
        // Ask for game type
        Scanner input1 = new Scanner(System.in);
        System.out.println("What type of math would you like to practice?");
        System.out.println("(Choices: add, subtract, multiply, divide)");
        System.out.print("> ");
        String choice;
        // verify that choice is good.
        while(true){
            choice = input1.nextLine();
            if(choice.equals("add")
            || choice.equals("subtract")
            || choice.equals("multiply")
            || choice.equals("divide"))
            {
                break;
            }
            System.out.println();
            System.out.println("That's not a choice.");
            System.out.println("Type: add, subtract, multiply, or divide");
            System.out.print("> ");
        }
        System.out.println();
        System.out.println("You've chosen: " + choice);
        System.out.println();
        
        int lives = 3;
        int num1;
        int num2;
        int answer;
        int score = 0;
        while(lives > 0){
            if(choice.equals("add")){
                num1 = (int)(Math.random()*10) + 1;
                num2 = (int)(Math.random()*10) + 1;
                System.out.println("What is " + num1 + " + " + num2 + "?");
                System.out.print("> ");
                answer = input1.nextInt();
                if(num1 + num2 != answer){
                    System.out.println("Incorrect. The answer is: " + (num1 + num2));
                    lives--;
                }
                else{
                    System.out.println("Correct!");
                    score++;
                }
            }
            else if(choice.equals("multiply")){
                num1 = (int)(Math.random()*10) + 1;
                num2 = (int)(Math.random()*10) + 1;
                System.out.println("What is " + num1 + " x " + num2 + "?");
                System.out.print("> ");
                answer = input1.nextInt();
                if(num1 * num2 != answer){
                    System.out.println("Incorrect. The answer is: " + (num1 * num2));
                    lives--;
                }
                else{
                    System.out.println("Correct!");
                    score++;
                }
            }
            else if(choice.equals("subtract")){
                num1 = (int)(Math.random()*10) + 1;
                num2 = (int)(Math.random()*10) + 1;
                if(num1 < num2){
                    int temp = num1;
                    num1 = num2;
                    num2 = temp;
                }
                System.out.println("What is " + num1 + " - " + num2 + "?");
                System.out.print("> ");
                answer = input1.nextInt();
                if(num1 - num2 != answer){
                    System.out.println("Incorrect. The answer is: " + (num1 - num2));
                    lives--;
                }
                else{
                    System.out.println("Correct!");
                    score++;
                }
            }
            else if(choice.equals("divide")){
                num1 = (int)(Math.random()*10) + 1;
                num2 = (int)(Math.random()*10) + 1;
                num1 = num1*num2;
                System.out.println("What is " + num1 + " / " + num2 + "?");
                System.out.print("> ");
                answer = input1.nextInt();
                if(num1 / num2 != answer){
                    System.out.println("Incorrect. The answer is: " + (num1 / num2));
                    lives--;
                }
                else{
                    System.out.println("Correct!");
                    score++;
                }
            }
        }
        System.out.println();
        System.out.println("Game Over! Thanks for playing!");
        System.out.println("Your final score was " + score + " questions answered correct.");
        System.out.println();
        System.out.println("Goodbye. <<EndProgram>>");
        
    }
}
