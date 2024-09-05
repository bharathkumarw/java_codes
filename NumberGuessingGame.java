package numberguessing;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    private static final int MAX_ATTEMPTS = 10;
    private static final int RANGE_START = 1;
    private static final int RANGE_END = 100;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(RANGE_END - RANGE_START + 1) + RANGE_START;
        int attempts = 0;
        boolean hasWon = false;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess the number between " + RANGE_START + " and " + RANGE_END + ".");
        System.out.println("You have " + MAX_ATTEMPTS + " attempts to guess the right number.");
        
        while (attempts < MAX_ATTEMPTS) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;
            
            if (guess == numberToGuess) {
                hasWon = true;
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Too Low!");
            } else {
                System.out.println("Too High!");
            }
            
            System.out.println("Attempts left: " + (MAX_ATTEMPTS - attempts));
        }
        
        if (hasWon) {
            System.out.println("Congratulations! You guessed the right number.");
        } else {
            System.out.println("Sorry, you've used all your attempts. The correct number was " + numberToGuess + ".");
        }
        
        scanner.close();
    }
}

