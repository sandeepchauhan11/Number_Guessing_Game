import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Core Concept: Random Numbers
        Random random = new Random();
        
        // Generates a random number between 1 and 100
        int targetNumber = random.nextInt(100) + 1; 
        
        int attempts = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a random number between 1 and 100.");
        System.out.println("Can you guess what it is?");


        while (!hasGuessedCorrectly) {
            System.out.print("\nEnter your guess: ");
            
            try {

                int guess = Integer.parseInt(scanner.nextLine());
                attempts++; 

                
                if (guess < 1 || guess > 100) {
                    System.out.println("Out of bounds! Please keep your guess between 1 and 100.");
                } else if (guess < targetNumber) {
                    System.out.println("Too low! Try a higher number.");
                } else if (guess > targetNumber) {
                    System.out.println("Too high! Try a lower number.");
                } else {
                    
                    System.out.println("🎉 Congratulations! You guessed the number " + targetNumber + " correctly!");
                    System.out.println("It took you " + attempts + " attempts.");
                    hasGuessedCorrectly = true; 
                }
                
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Please enter a whole number.");
            }
        }
        
        scanner.close();
    }
}