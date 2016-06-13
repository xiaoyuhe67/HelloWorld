/* This is the application to guess number from system
* Application would generate a number automatically.
* Then users need to enter their guess numbers.
* Application will prompt users if their numbers are high or low.
* User will keep enter their guess number until they get the random number.
*/
import java.util.Random;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
    
        Scanner scan = new Scanner(System.in);
        
        // Set up random number from 1 to 100
        Random random = new Random();
        long from = 1;
        long to = 100;
        int randomNumber = (int) (random.nextInt((int) (to - from + 1)) + from);
        // Initialize a guess number
        int guessedNumber = 0;
 
        // Print the prompt message for user
        System.out.printf("The number is between %d and %d.\n", from, to);
        
        // Do the loop to guess number
        do
        {
            System.out.print("Guess what the number is: ");
            guessedNumber = scan.nextInt();
            if (guessedNumber > randomNumber)
                System.out.println("Your guess is too high!");
            else if (guessedNumber < randomNumber)
                System.out.println("Your guess is too low!");
            else
                System.out.println("You got it!");
        } while (guessedNumber != randomNumber);
    }
} 