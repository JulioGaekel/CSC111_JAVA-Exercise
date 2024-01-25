package Chapter3_Selections;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        // Generate random lottery number
        int lottery = (int)(Math.random() * 100);

        // Prompt the user to enter a guess
        Scanner sc = new Scanner(System.in);
        System.out.println("The lottery number is " + lottery); // NOTE: TEST PURPOSES. DELETE AFTER.
        System.out.print("Enter lottery number (two digits): ");
        int guess = sc.nextInt();

        // Get digits from lottery
        int lotteryDigit1 = lottery / 10;
        int lotteryDigit2 = lottery % 10;

        // Get digits from guess
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.println("The lottery number is " + lottery);

        // Check guess
        if (guess == lottery) {
            System.out.println("Exact guess: you win $10,000");
        } else if (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1) {
            System.out.println("second case");
        } else if (/*CONTINUAR ACA*/){

        }
    }
}
