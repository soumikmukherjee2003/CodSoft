import java.util.Scanner;
import java.util.Random;
public class NumberGame
{
 public static void main(String[] args)
 {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int lowerbound = 1;
    int upperbound = 100;
    int randomnumber = random.nextInt(upperbound - lowerbound + 1) + lowerbound;
    int attempts = 0;
    boolean numberguessed = false;
    System.out.println("Welcome to the Number Guessing Game!");
    System.out.println("I have selected a random number between" + lowerbound + "and" + upperbound + "Try to guess!");
    while(!numberguessed)
    {
        System.out.println("Enter the guess number:");
        int userGuess = scanner.nextInt();
        attempts++;

        if(userGuess < lowerbound || userGuess > upperbound)
        {
            System.out.println("Please enter a number between" + lowerbound + "and" + upperbound + ".");
        }
        else if(userGuess < randomnumber)
        {
            System.out.println("Higher Number. Try Again.");
        }
        else if(userGuess > randomnumber)
        {
            System.out.println("Lower Number. Try Again.");
        }
        else
        {
            numberguessed = true;
            System.out.println("Number is guessed correctly" + randomnumber + "in" + attempts + "attempts.");
         
        }
        }
        scanner.close();
        }
    }
 
