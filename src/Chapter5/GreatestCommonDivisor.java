package Chapter5;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter first integer: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter second integer: ");
        int secondNumber = sc.nextInt();

        int gcd = 1; // Greater common divisor initial value is 1
        int k = 2; //possible gcd

        while (k <= firstNumber && k <= secondNumber) {
            if (firstNumber % k == 0 && secondNumber % k == 0) {
                gcd = k;
            }
            k++;
        }
        System.out.println("The greatest common divisor for " + firstNumber + " and " + secondNumber + " is " + gcd);
    }
}
