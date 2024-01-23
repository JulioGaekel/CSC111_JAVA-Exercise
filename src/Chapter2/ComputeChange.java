package Chapter2;

import java.util.Locale;
import java.util.Scanner;

/* AUFGABE: The program lets the user enter an amount as a double value representing a total in dollars and cents, and outputs a report listing the monetary equivalent in the maximum number of dollars, quarters, dimes, nickels, and pennies, in this order, to result in the minimum number of coins.*/
public class ComputeChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);

        // Prompt user for input
        System.out.print("Enter an amount in dollars: ");
        double amountInDollars = sc.nextDouble();

        // Get number of cents
        int totalAmountInCents = (int)(amountInDollars * 100);

        // Find the number of dollars
        int totalDollars = totalAmountInCents / 100;
        int centsRemaining = totalAmountInCents % 100;

        // Find number of quarters
        int numberOfQuarters = centsRemaining / 25;
        centsRemaining = centsRemaining % 25;

        // Find number of dimes
        int numberOfDimes = centsRemaining / 10;
        centsRemaining = centsRemaining % 10;

        // Find number of nickels
        int numberOfNickels = centsRemaining / 5;
        int penniesRemaining = centsRemaining % 5;

        System.out.println(totalDollars + " dollars, " + numberOfQuarters + " quarters, " + numberOfDimes + " dimes, " + numberOfNickels + " nickels, and " + penniesRemaining + " pennies.");
    }
}
