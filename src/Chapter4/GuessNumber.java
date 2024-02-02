package Chapter4;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        // Generate random number
        int number = (int)(Math.random() * 101);

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Prompt user for guess
        System.out.println("Guess a number between 0 and 100");

        int guess = -1; // The variable is not initialized with '0' because then it could sometimes be the right answer if the generated number is '0'.
        while (guess != number) {
            // Prompt the user to enter a guess
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            if (guess == number) {
                System.out.println("Yes, the number is " + number);
            } else if (guess > number) {
                System.out.println("Your guess is too high");
            } else {
                System.out.println("Your guess is too low");
            }
        }


    }
}
