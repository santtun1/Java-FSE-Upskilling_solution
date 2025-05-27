// Q10: Number Guessing Game
// Objective: Implement loops and conditional logic.
// Task: Create a game where the user guesses a randomly generated number.
// Instructions:
// - Generate a random number between 1 and 100.
// - Prompt the user to guess the number.
// - Provide feedback if the guess is too high or too low.
// - Continue until the user guesses correctly.

import java.util.Scanner;
import java.util.Random;

public class Q10_NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("Guess the number between 1 and 100:");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low. Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high. Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }
        } while (guess != numberToGuess);

        scanner.close();
    }
}
