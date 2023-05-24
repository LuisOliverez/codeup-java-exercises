import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // Generate random number between 1 and 100

        System.out.println("Welcome to the High-Low game!");
        System.out.println("Guess a number between 1 and 100.");

        Scanner sc = new Scanner(System.in);
        int guess;
        boolean guessedCorrectly = false;

        while (!guessedCorrectly) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess < 1 || guess > 100) {
                System.out.println("Invalid guess! Please enter a number between 1 and 100.");
            } else if (guess < randomNumber) {
                System.out.println("HIGHER");
            } else if (guess > randomNumber) {
                System.out.println("LOWER");
            } else {
                System.out.println("GOOD GUESS!");
                guessedCorrectly = true;
            }
        }

        System.out.println("Thank you for playing!");






    }
}
