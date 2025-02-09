import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = random.nextInt(10) + 1;
        int maxGuesses = 5;
        int attempts = 0;
        boolean hasWon = false;

        System.out.println("Welcome to 'Guess the Number'!");
        System.out.println("I have selected a number between 1 and 10. You have " + maxGuesses + " attempts to guess it.");

        while (attempts < maxGuesses) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You've guessed the correct number.");
                hasWon = true;
                break;
            } else if (userGuess > randomNumber) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Too low, try again.");
            }

            System.out.println("Attempts left: " + (maxGuesses - attempts));
        }

        if (!hasWon) {
            System.out.println("You've run out of attempts! The correct number was " + randomNumber + ".");
        }

        System.out.println("Thank you for playing!");
    }
}
